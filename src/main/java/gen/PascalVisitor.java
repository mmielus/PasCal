// Generated from C:/Users/user/Desktop/PasCal\Pascal.g4 by ANTLR 4.7
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PascalParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#programHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHead(PascalParser.ProgramHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PascalParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PascalParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#declarationsAndDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationsAndDefinitions(PascalParser.DeclarationsAndDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinitionPart(PascalParser.ConstantDefinitionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#constantDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinition(PascalParser.ConstantDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(PascalParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(PascalParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#unsignedInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedInteger(PascalParser.UnsignedIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#unsignedReal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedReal(PascalParser.UnsignedRealContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PascalParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(PascalParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinitionPart(PascalParser.TypeDefinitionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(PascalParser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#typedefBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefBody(PascalParser.TypedefBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PascalParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(PascalParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#subrangeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrangeType(PascalParser.SubrangeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(PascalParser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#standardType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardType(PascalParser.StandardTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpackedStructuredType(PascalParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(PascalParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#recordType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordType(PascalParser.RecordTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#fixedPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedPart(PascalParser.FixedPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#recordSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordSection(PascalParser.RecordSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#pointerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerType(PascalParser.PointerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationPart(PascalParser.VariableDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(PascalParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureAndFunctionDeclarationPart(PascalParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureOrFunctionDeclaration(PascalParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(PascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#blockOrDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockOrDirective(PascalParser.BlockOrDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(PascalParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(PascalParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterSection(PascalParser.FormalParameterSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(PascalParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#varParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarParameter(PascalParser.VarParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(PascalParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#resultType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultType(PascalParser.ResultTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PascalParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlabelledStatement(PascalParser.UnlabelledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#exitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitStatement(PascalParser.ExitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#writeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(PascalParser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(PascalParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(PascalParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PascalParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variableExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExtension(PascalParser.VariableExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#dotIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotIdentifier(PascalParser.DotIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#compoundExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundExpression(PascalParser.CompoundExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#moreExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreExpressions(PascalParser.MoreExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PascalParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(PascalParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(PascalParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#simpleExpressionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpressionOperator(PascalParser.SimpleExpressionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(PascalParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperators(PascalParser.OperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#signedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedFactor(PascalParser.SignedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(PascalParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedConstant(PascalParser.UnsignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#functionDesignator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDesignator(PascalParser.FunctionDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(PascalParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(PascalParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(PascalParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureStatement(PascalParser.ProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#actualParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameter(PascalParser.ActualParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(PascalParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(PascalParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredStatement(PascalParser.StructuredStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PascalParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(PascalParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(PascalParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PascalParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(PascalParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#caseListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseListElement(PascalParser.CaseListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(PascalParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(PascalParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PascalParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#forList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForList(PascalParser.ForListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#initialValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialValue(PascalParser.InitialValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#finalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalValue(PascalParser.FinalValueContext ctx);
}