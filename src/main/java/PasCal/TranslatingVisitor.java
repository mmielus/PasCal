package PasCal;

import gen.PascalBaseVisitor;
import gen.PascalParser;

import java.util.HashMap;
import java.util.Map;

/**
 * @author michal.mielus
 */
public class TranslatingVisitor extends PascalBaseVisitor<String>
{

    private final Map<String, String> typeMapping;
    private final HashMap<String, String> operatorMapping;

    private static int blockCount = 0;
    private static boolean printMain = false;
    private static boolean mainPrinted = false;
    public static int varDecls = 0;
    private static String currentVars = null;

    public TranslatingVisitor()
    {
        typeMapping = new HashMap<String, String>();
        typeMapping.put("integer", "int");
        typeMapping.put("boolean", "int");
        typeMapping.put("char", "char");
        typeMapping.put("real", "float");
        typeMapping.put("string", "char*");
        typeMapping.put("word", "int");
        typeMapping.put("longint", "long");

        operatorMapping = new HashMap<String, String>();
        operatorMapping.put("or", "||");
        operatorMapping.put("and", "&&");
        operatorMapping.put("nil", "NULL");//or zero
        operatorMapping.put(":=", "=");
        operatorMapping.put("=", "==");
        operatorMapping.put("<>", "!=");
        operatorMapping.put("<=", "<=");
        operatorMapping.put(">=", ">=");
        operatorMapping.put("<", "<");
        operatorMapping.put(">", ">");
        operatorMapping.put("+", "+");
        operatorMapping.put("-", "-");
        operatorMapping.put("*", "*");
        operatorMapping.put("/", "/");
        operatorMapping.put("div", "/");
        operatorMapping.put("mod", "%");
    }

    @Override
    protected String defaultResult()
    {
        return "";
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult)
    {
        return aggregate + nextResult;
    }

    @Override
    public String visitProgram(PascalParser.ProgramContext ctx)
    {
        String imports = "#include <stdlib.h>\n#include <stdio.h>\n";
        String block = visit(ctx.block());

        return imports + block;
    }

    @Override
    public String visitIdentifier(PascalParser.IdentifierContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitBlock(PascalParser.BlockContext ctx)
    {
        blockCount++;

        StringBuilder sb = new StringBuilder();
        int count = ctx.declarationsAndDefinitions().size();
        for (int i = 0; i < count; i++) {
            sb.append(visit(ctx.declarationsAndDefinitions(i)));
        }

        if (blockCount == 1) {
            if (!mainPrinted) {
                printMain = true;
            }
        }

        sb.append(visit(ctx.compoundStatement()));

        blockCount--;
        return sb.toString();
    }

    @Override
    public String visitDeclarationsAndDefinitions(PascalParser.DeclarationsAndDefinitionsContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public String visitConstantDefinitionPart(PascalParser.ConstantDefinitionPartContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("const ");
        sb.append(visit(ctx.constantDefinition(0)));
        sb.append(";\n");

        int defCount = ctx.constantDefinition().size();
        for (int i = 1; i < defCount; i++) {
            sb.append("const ");
            sb.append(visit(ctx.constantDefinition(i)));
            sb.append(";\n");
        }

        return sb.toString();
    }

    @Override
    public String visitConstantDefinition(PascalParser.ConstantDefinitionContext ctx)
    {
        String id = visit(ctx.identifier());
        String constant = visit(ctx.constant());

        if (constant.startsWith("\"")) {
            return String.format("char* %s = %s", id, constant);
        }

        return String.format("int %s = %s", id, constant);
    }

    @Override
    public String visitUnsignedNumber(PascalParser.UnsignedNumberContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitUnsignedInteger(PascalParser.UnsignedIntegerContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitUnsignedReal(PascalParser.UnsignedRealContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitSign(PascalParser.SignContext ctx)
    {
        return ctx.getText();
    }

    @Override
    public String visitString(PascalParser.StringContext ctx)
    {
        return ctx.getText().replaceAll("'", "\"");
    }

    @Override
    public String visitTypeDefinitionPart(PascalParser.TypeDefinitionPartContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.typeDefinition(0)));
        sb.append(";\n");

        int defCount = ctx.typeDefinition().size();
        for (int i = 1; i < defCount; i++) {
            sb.append(visit(ctx.typeDefinition(i)));
            sb.append(";\n");
        }

        return sb.toString();
    }

    @Override
    public String visitTypeDefinition(PascalParser.TypeDefinitionContext ctx)
    {
        String id = visit(ctx.identifier());
        String typedefBody = visit(ctx.typedefBody());
        String bodyWithId = typedefBody.replace("?", id);
        return bodyWithId;
    }

    @Override
    public String visitTypedefBody(PascalParser.TypedefBodyContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public String visitType(PascalParser.TypeContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public String visitSimpleType(PascalParser.SimpleTypeContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public String visitSubrangeType(PascalParser.SubrangeTypeContext ctx)
    {
        String upperLimit = visit(ctx.constant(1));
        return upperLimit;
    }

    @Override
    public String visitTypeIdentifier(PascalParser.TypeIdentifierContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public String visitStandardType(PascalParser.StandardTypeContext ctx)
    {
        return typeMapping.get(ctx.getText());
    }

    @Override
    public String visitUnpackedStructuredType(PascalParser.UnpackedStructuredTypeContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public String visitArrayType(PascalParser.ArrayTypeContext ctx)
    {
        String len = visit(ctx.subrangeType());
        String type = visit(ctx.type());

        return String.format("%s ?[%s]", type, len);
    }

    @Override
    public String visitRecordType(PascalParser.RecordTypeContext ctx)
    {
        return String.format("typedef struct {\n %s \n} ?", visit(ctx.fixedPart()));
    }

    @Override
    public String visitFixedPart(PascalParser.FixedPartContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.recordSection(0)));

        int count = ctx.recordSection().size();
        for (int i = 1; i < count; i++) {
            sb.append(visit(ctx.recordSection(i)));
        }

        return sb.toString();
    }

    @Override
    public String visitRecordSection(PascalParser.RecordSectionContext ctx)
    {
        String ids = visit(ctx.identifierList());
        String type = visit(ctx.type());

        return String.format("%s %s;", type, ids);
    }


    @Override
    public String visitPointerType(PascalParser.PointerTypeContext ctx)
    {
        String typeIdentifier = visit(ctx.typeIdentifier());
        return String.format("%s*", typeIdentifier);
    }

    @Override
    public String visitVariableDeclarationPart(PascalParser.VariableDeclarationPartContext ctx)
    {
        varDecls++;

        StringBuilder sb = new StringBuilder();
        int count = ctx.variableDeclaration().size();
        for (int i = 0; i < count; i++) {
            sb.append(visit(ctx.variableDeclaration(i)));
        }

//        if(varDecls == 1) { //'global' variables
//            return sb.toString();
//        }

        currentVars = sb.toString();
        return ""; //local variables will be held inside the block -> currentVars
    }

    @Override
    public String visitVariableDeclaration(PascalParser.VariableDeclarationContext ctx)
    {
        String type = visit(ctx.type());
        String ids = visit(ctx.identifierList());

        if (type.contains("[")) {
            return type.replace("?", ids) + ";\n";
        }

        return type.replace("?", "") + " " + ids + ";\n";
    }

    @Override
    public String visitProcedureAndFunctionDeclarationPart(PascalParser.ProcedureAndFunctionDeclarationPartContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public String visitProcedureOrFunctionDeclaration(PascalParser.ProcedureOrFunctionDeclarationContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public String visitProcedureDeclaration(PascalParser.ProcedureDeclarationContext ctx)
    {
        String formalParams = "()";
        if (ctx.formalParameterList() != null) {
            formalParams = visit(ctx.formalParameterList());
        }
        return String.format(
                "void %s%s %s",
                visit(ctx.identifier()),
                formalParams,
                visit(ctx.body));
    }

    @Override
    public String visitBlockOrDirective(PascalParser.BlockOrDirectiveContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public String visitFunctionDeclaration(PascalParser.FunctionDeclarationContext ctx)
    {
        String name = visit(ctx.identifier());
        String resultType = visit(ctx.resultType());
        String formalParams = "()";
        if (ctx.formalParameterList() != null) {
            formalParams = visit(ctx.formalParameterList());
        }
        String body = visit(ctx.body);

        body = body.replaceAll(name + "\\s*=", "return ");

        return String.format(
                "%s %s%s%s",
                resultType,
                name,
                formalParams,
                body
        );
    }

    @Override
    public String visitFormalParameterList(PascalParser.FormalParameterListContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(visit(ctx.formalParameterSection(0)));

        int paramsCount = ctx.formalParameterSection().size();
        for (int i = 1; i < paramsCount; i++) {
            sb.append(", ");
            sb.append(visit(ctx.formalParameterSection(i)));
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String visitFormalParameterSection(PascalParser.FormalParameterSectionContext ctx)
    {
        if (ctx.parameter() != null) {
            String param = visit(ctx.parameter());
            return param.replace("?", "");
        }

        String varParam = visit(ctx.varParameter());
        return varParam.replace("?", "*");
    }

    @Override
    public String visitParameter(PascalParser.ParameterContext ctx)
    {
        String type = visit(ctx.typeIdentifier());
        String id = visit(ctx.identifier());

        //'?' for possible pointer in FormalParameterSection
        return String.format("%s? %s", type, id);
    }

    @Override
    public String visitVarParameter(PascalParser.VarParameterContext ctx)
    {
        String param = visit(ctx.parameter());
        return param.replace("?", "*");
    }

    @Override
    public String visitIdentifierList(PascalParser.IdentifierListContext ctx)
    {
        StringBuilder ret = new StringBuilder();
        ret.append(ctx.identifier(0).getText());
        int idCount = ctx.identifier().size();
        for (int i = 1; i < idCount; i++) {
            ret.append(", ");
            ret.append(ctx.identifier(i).getText());
        }
        return ret.toString();
    }

    @Override
    public String visitResultType(PascalParser.ResultTypeContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public String visitStatement(PascalParser.StatementContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public String visitUnlabelledStatement(PascalParser.UnlabelledStatementContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public String visitExitStatement(PascalParser.ExitStatementContext ctx)
    {
        return "exit(0)";
    }

    @Override
    public String visitSimpleStatement(PascalParser.SimpleStatementContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public String visitAssignmentStatement(PascalParser.AssignmentStatementContext ctx)
    {
        String var = visit(ctx.variable());
        String expr = visit(ctx.expression());
        return String.format("%s = %s;\n", var, expr);
    }

    @Override
    public String visitWriteStatement(PascalParser.WriteStatementContext ctx)
    {
        String ident = visit(ctx.identifier());
        return String.format("printf(\"%s\",%s);\n", "%d", ident);
    }

    @Override
    public String visitVariable(PascalParser.VariableContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.identifier()));

        int count = ctx.variableExtension().size();
        for (int i = 0; i < count; i++) {
            sb.append(visit(ctx.variableExtension(i)));
        }

        return sb.toString();
    }

    @Override
    public String visitVariableExtension(PascalParser.VariableExtensionContext ctx)
    {
        if (ctx.compoundExpression() != null) {
            return visit(ctx.compoundExpression());
        }

        if (ctx.dotIdentifier() != null) {
            return visit(ctx.dotIdentifier());
        }

        //musi być pointer
        return "*";
    }

    @Override
    public String visitDotIdentifier(PascalParser.DotIdentifierContext ctx)
    {
        String id = visit(ctx.identifier());
        return "." + id;
    }

    @Override
    public String visitCompoundExpression(PascalParser.CompoundExpressionContext ctx)
    {
        return String.format("[%s %s]", visit(ctx.expression()), visit(ctx.moreExpressions()));
    }

    @Override
    public String visitMoreExpressions(PascalParser.MoreExpressionsContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        int len = ctx.COMMA().size();
        for (int i = 0; i < len; i++) {
            sb.append(String.format(", %s", visit(ctx.expression(i))));
        }
        return sb.toString();
    }

    @Override
    public String visitExpression(PascalParser.ExpressionContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.simpleExpression(0)));
        if (ctx.operator(0) == null) {
            return sb.toString();
        }

        sb.append(visit(ctx.operator(0)));
        sb.append(" ");
        sb.append(visit(ctx.simpleExpression(1)));

        int pairsCount = ctx.operator().size();
        for (int i = 1; i < pairsCount; i++) {
            sb.append(String.format(" %s %s",
                    visit(ctx.operator(i)),
                    visit(ctx.simpleExpression(i + 1))));
        }
        return sb.toString();
    }

    @Override
    public String visitOperator(PascalParser.OperatorContext ctx)
    {
        return operatorMapping.get(ctx.getText());
    }

    @Override
    public String visitSimpleExpression(PascalParser.SimpleExpressionContext ctx)
    {
        String firstTerm = visit(ctx.term(0));
        StringBuilder sb = new StringBuilder();
        sb.append(firstTerm);

        int termCount = ctx.term().size();
        for (int i = 1; i < termCount; i++) {
            sb.append(String.format(" %s %s",
                    visit(ctx.simpleExpressionOperator(i - 1)),
                    visit(ctx.term(i))));
        }

        return sb.toString();
    }

    @Override
    public String visitSimpleExpressionOperator(PascalParser.SimpleExpressionOperatorContext ctx)
    {
        return operatorMapping.get(ctx.getText());
    }

    @Override
    public String visitTerm(PascalParser.TermContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.signedFactor(0)));

        int count = ctx.operators().size();
        for (int i = 0; i < count; i++) {
            sb.append(visit(ctx.operators(i)));
            sb.append(visit(ctx.signedFactor(i + 1)));
        }

        return sb.toString();
    }

    @Override
    public String visitOperators(PascalParser.OperatorsContext ctx)
    {
        return operatorMapping.get(ctx.getText());
    }

    @Override
    public String visitSignedFactor(PascalParser.SignedFactorContext ctx)
    {
        String sign = "";
        if (ctx.sign() != null) {
            sign = visit(ctx.sign());
        }

        String factor = visit(ctx.factor());
        return sign + factor;
    }

    @Override
    public String visitFactor(PascalParser.FactorContext ctx)
    {
        if (ctx.variable() != null) {
            return visit(ctx.variable());
        }

        if (ctx.expression() != null) {
            String expr = visit(ctx.expression());
            return String.format("(%s)", expr);
        }

        if (ctx.functionDesignator() != null) {
            return visit(ctx.functionDesignator());
        }

        if (ctx.unsignedConstant() != null) {
            return visit(ctx.unsignedConstant());
        }

        //musi być not factor
        return "!" + visit(ctx.factor());
    }

    @Override
    public String visitUnsignedConstant(PascalParser.UnsignedConstantContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public String visitFunctionDesignator(PascalParser.FunctionDesignatorContext ctx)
    {
        String id = visit(ctx.identifier());
        String params = visit(ctx.parameterList());

        return String.format("%s(%s)", id, params);
    }

    @Override
    public String visitParameterList(PascalParser.ParameterListContext ctx)
    {
        String firstParam = visit(ctx.actualParameter(0));

        StringBuilder sb = new StringBuilder();
        sb.append(firstParam);

        int paramCount = ctx.actualParameter().size();
        for (int i = 1; i < paramCount; i++) {
            sb.append(", ");
            sb.append(visit(ctx.actualParameter(i)));
        }

        return sb.toString();
    }

    @Override
    public String visitElementList(PascalParser.ElementListContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.element(0));

        int count = ctx.element().size();
        for (int i = 0; i < count; i++) {
            sb.append(", ");
            sb.append(visit(ctx.element(i)));
        }

        return sb.toString();
    }

    @Override
    public String visitElement(PascalParser.ElementContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public String visitProcedureStatement(PascalParser.ProcedureStatementContext ctx)
    {
        String identifier = visit(ctx.identifier());
        String params = visit(ctx.parameterList());
        return String.format("%s(%s);", identifier, params);
    }

    @Override
    public String visitActualParameter(PascalParser.ActualParameterContext ctx)
    {
        if (ctx.expression() != null) {
            return visit(ctx.expression());
        }

        if (ctx.string() != null) {
            return visit(ctx.string());
        }

        return "";
    }

    @Override
    public String visitEmptyStatement(PascalParser.EmptyStatementContext ctx)
    {
        return "";
    }

    @Override
    public String visitEmpty(PascalParser.EmptyContext ctx)
    {
        return "";
    }

    @Override
    public String visitStructuredStatement(PascalParser.StructuredStatementContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public String visitCompoundStatement(PascalParser.CompoundStatementContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        if (printMain) {
            if (!mainPrinted) { //sprawdzam czy to byl ostatni blok i czy tearz maina trzeba wypisac
                sb.append("int main(int argc, char **argv) ");
                mainPrinted = true;
            }
        }
        sb.append("{\n");
        if (currentVars != null) {
            sb.append(currentVars);
            currentVars = null;
        }
        sb.append(visit(ctx.statements()));
        sb.append("\n}\n");

        return sb.toString();
    }

    @Override
    public String visitStatements(PascalParser.StatementsContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.statement(0)));

        int count = ctx.statement().size();
        for (int i = 1; i < count; i++) {
            sb.append(visit(ctx.statement(i)));
        }

        return sb.toString();
    }

    @Override
    public String visitConditionalStatement(PascalParser.ConditionalStatementContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public String visitIfStatement(PascalParser.IfStatementContext ctx)
    {
        String condition = visit(ctx.expression());
        String stat = visit(ctx.statement(0));
        String elseStat = "";
        if (ctx.statement().size() > 1) {
            elseStat = String.format(" else \n %s \n", visit(ctx.statement(1)));
        }

        return String.format("if(%s)\n%s%s", condition, stat, elseStat);
    }

    @Override
    public String visitCaseStatement(PascalParser.CaseStatementContext ctx)
    {
        String expr = visit(ctx.expression());

        StringBuilder cases = new StringBuilder();
        cases.append(String.format("%s", visit(ctx.caseListElement(0))));

        int count = ctx.caseListElement().size();
        for (int i = 1; i < count; i++) {
            cases.append(visit(ctx.caseListElement(i)));
        }

        String defaultVal = "";
        String statements = "";
        if (ctx.statements() != null) {
            statements = visit(ctx.statements());
            defaultVal = String.format("default:\n%s\nbreak;\n", statements);
        }

        return String.format("switch(%s) {\n%s%s\n}", expr, cases.toString(), defaultVal);
    }

    @Override
    public String visitCaseListElement(PascalParser.CaseListElementContext ctx)
    {
        String cons = visit(ctx.constant());
        String stat = visit(ctx.statement());
        return String.format("case %s:\n%s\nbreak;\n", cons, stat);
    }

    @Override
    public String visitWhileStatement(PascalParser.WhileStatementContext ctx)
    {
        String expression = visit(ctx.expression());
        String statement = visit(ctx.statement());
        return String.format("while (%s) %s", expression, statement);
    }

    @Override
    public String visitForStatement(PascalParser.ForStatementContext ctx)
    {
        String identifier = ctx.identifier().getText();
        String forConditions = visit(ctx.forList()).replace("?", identifier);
        String statement = visit(ctx.statement());

        StringBuilder sb = new StringBuilder();
        sb.append("for(");
        sb.append(forConditions);
        sb.append(") \n");
        sb.append(statement);
        sb.append("\n\n");

        return sb.toString();
    }

    @Override
    public String visitForList(PascalParser.ForListContext ctx)
    {
        String initialValue = visit(ctx.initialValue());
        String finalValue = visit(ctx.finalValue());
        String rel;
        String updateType;

        if (ctx.rel.getText().equals("to")) {
            rel = "<";
            updateType = "++";
        } else {
            rel = ">";
            updateType = "--";
        }

        return String.format("? = %s; ? %s %s; ?%s",
                initialValue, rel, finalValue, updateType);
    }

    @Override
    public String visitInitialValue(PascalParser.InitialValueContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override
    public String visitFinalValue(PascalParser.FinalValueContext ctx)
    {
        return visitChildren(ctx);
    }
}
