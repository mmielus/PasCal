grammar Pascal;


AND              : 'and'             ;
ARRAY            : 'array'           ;
BEGIN            : 'begin'           ;
BOOLEAN          : 'boolean'         ;
CASE             : 'case'            ;
CHAR             : 'char'            ;
CHR              : 'chr'             ;
CONST            : 'const'           ;
DIV              : 'div'             ;
DO               : 'do'              ;
DOWNTO           : 'downto'          ;
EXIT             : 'exit'            ;
ELSE             : 'else'            ;
END              : 'end'             ;
FOR              : 'for'             ;
FUNCTION         : 'function'        ;
IF               : 'if'              ;
IN               : 'in'              ;
INTEGER          : 'integer'         ;
MOD              : 'mod'             ;
NIL              : 'nil'             ;
NOT              : 'not'             ;
OF               : 'of'              ;
OR               : 'or'              ;
PROCEDURE        : 'procedure'       ;
PROGRAM          : 'program'         ;
REPEAT           : 'repeat'          ;
REAL             : 'real'            ;
RECORD           : 'record'          ;
THEN             : 'then'            ;
TYPE             : 'type'            ;
TO               : 'to'              ;
UNTIL            : 'until'           ;
VAR              : 'var'             ;
WHILE            : 'while'           ;
STRING           : 'string'          ;


ASSIGN          : ':='  ;
COMMA           : ','   ;
COLON           : ':'   ;
DOT             : '.'   ;
DOTDOT          : '..'  ;
EQUAL           : '='   ;
LT              : '<'   ;
LE              : '<='  ;
PLUS            : '+'   ;
MINUS           : '-'   ;
NOT_EQUAL       : '<>'  ;
POINTER         : '^'   ;
RBRACK          : ']'   ;
STAR            : '*'   ;
SLASH           : '/'   ;
SEMI            : ';'   ;
GE              : '>='  ;
GT              : '>'   ;
LPAREN          : '('   ;
RPAREN          : ')'   ;
LBRACK          : '['   ;
LCURLY          : '{' ;
RCURLY          : '}' ;

//początek programu
program
    : programHead
      block
      DOT
    ;

programHead
    : PROGRAM identifier (LPAREN identifierList RPAREN)? SEMI
  ;

identifier
    : IDENT
    ;
//blok dla stalych,zmiennych,typow i cial funkcji
block
    : declarationsAndDefinitions* compoundStatement
    ;

declarationsAndDefinitions
    : ( constantDefinitionPart
      | typeDefinitionPart
      | variableDeclarationPart
      | procedureAndFunctionDeclarationPart
      )
    ;
//czesc dla staych
constantDefinitionPart
    : CONST constantDefinition ( SEMI constantDefinition )* SEMI
    ;

constantDefinition
    : identifier EQUAL constant
    ;

constant
    : unsignedNumber
    | s=sign n=unsignedNumber
    | string
    ;
//------------------
unsignedNumber
    : unsignedInteger
    | unsignedReal
    ;

unsignedInteger
    : NUM_INT
    ;

unsignedReal
    : NUM_REAL
    ;

string
    : STRING_LITERAL
    ;
sign
    : PLUS | MINUS
    ;
//czesc dla typow
typeDefinitionPart
    : TYPE typeDefinition ( SEMI typeDefinition )* SEMI
    ;

//
typeDefinition
    : identifier e=EQUAL typedefBody
    ;

typedefBody
    : type
    ;

type
    : simpleType
    | unpackedStructuredType
    | pointerType
    ;
// tutaj albo zasieg albo jakis typ
simpleType
    : subrangeType
    | typeIdentifier
    ;
// x...y, 0..2 po prostu zasieg w tablicy
subrangeType
    : constant DOTDOT constant
    ;
// costam , char, boolean
typeIdentifier
    : identifier
    | standardType
    ;

standardType
    : CHAR
    | BOOLEAN
    | INTEGER
    | REAL
    | STRING
    ;
//tablica albo rekord
unpackedStructuredType
    : arrayType
    | recordType
    ;
// array (0..1) of int
arrayType
    : ARRAY LBRACK subrangeType RBRACK OF type
  ;
// record name:string; age:int end
recordType
    : RECORD fixedPart END
    ;
// x,y,z : int; a,b,c : float
fixedPart
    : recordSection ( SEMI recordSection )*
    ;
// x,y,z : int
recordSection
    : identifierList COLON type
    ;
// wskaznik ^x
pointerType
    : POINTER typeIdentifier
    ;

//praktycznie tak samo jak dla typow
variableDeclarationPart
    : VAR variableDeclaration ( SEMI variableDeclaration )* SEMI
    ;

variableDeclaration
    : identifierList c=COLON type
    ;
// funkcje albo procedury
procedureAndFunctionDeclarationPart
    : procedureOrFunctionDeclaration SEMI
    ;

procedureOrFunctionDeclaration
    : procedureDeclaration
    | functionDeclaration
    ;
// procedure jakastam (n :integer) ;
procedureDeclaration
    : PROCEDURE identifier (formalParameterList)? SEMI
      body=blockOrDirective
    ;

blockOrDirective
    : block
    ;

//podobnie jak dla procedury
functionDeclaration
    : FUNCTION identifier (formalParameterList)? COLON resultType SEMI
      body=blockOrDirective
    ;

//(x : integer) albo (var jakies :integer)
formalParameterList
    : LPAREN formalParameterSection ( SEMI formalParameterSection )* RPAREN
    ;

formalParameterSection
    : parameter
    | varParameter
    ;

parameter
    : identifier COLON t=typeIdentifier
    ;

varParameter
    : VAR parameter
    ;
//-------------------------------
// x,y,t
identifierList
    : identifier ( COMMA identifier )*
    ;

resultType
    : typeIdentifier
    ;

statement
    : unlabelledStatement
    ;

unlabelledStatement
    : simpleStatement
    | structuredStatement
    ;

exitStatement
    : EXIT 
    ;


simpleStatement
    : assignmentStatement
    | procedureStatement
    | exitStatement
    | emptyStatement
    ;
//np x:= 2+a albo x.x := 2 ogolnie przypisania
assignmentStatement
    : variable ASSIGN expression
    ;
//auto.silnik albo auto^ albo auto(silnika+2,a+3)
variable
    : identifier variableExtension*
    ;

variableExtension
    : compoundExpression
    | dotIdentifier
    | POINTER
    ;

dotIdentifier
    : DOT identifier
    ;
///(x+2,t+3)
compoundExpression
    : LBRACK expression moreExpressions RBRACK
    ;

moreExpressions
    : ( COMMA expression )*
    ;
//to sa wyrazene arytmetyczne i logiczne ogolnie ciezko to ogarnac bo to rekurencyjnie jest i pozawijane bardzo
expression
    : simpleExpression ( operator simpleExpression )*
    ;
///
operator
    : (EQUAL | NOT_EQUAL | LT | LE | GE | GT | IN)
    ;

simpleExpression
    : term ( simpleExpressionOperator term )*
    ;

simpleExpressionOperator
    : PLUS | MINUS | OR ;

term
    : signedFactor ( operators signedFactor )*
    ;

operators
    : (STAR | SLASH | DIV | MOD | AND)
    ;
//
signedFactor
    : (sign)? factor
    ;
//auto.silnik albo (x+2) albo costam albo fun(a,b,c)
factor
    : variable
    | LPAREN expression RPAREN
    | functionDesignator
    | unsignedConstant
    | NOT factor
    ;

unsignedConstant
    : unsignedNumber
    | string
    | NIL
    ;

functionDesignator
    : id=identifier LPAREN args=parameterList RPAREN
    ;

parameterList
    : actualParameter ( COMMA actualParameter )*
    ;

elementList
    : element ( COMMA element )*
    |
    ;

element
    : expression
    ;
// procedurka proc(x,a,g)
procedureStatement
    : id=identifier ( LPAREN args=parameterList RPAREN )?
    ;

actualParameter
    : expression
    | string  
    | emptyStatement
    ;

emptyStatement
    :
    ;

empty
    :
    ;

structuredStatement
    : compoundStatement
    | conditionalStatement
    | loopStatement
    ;

compoundStatement
    : BEGIN
    statements
      END
    ;

statements
    : statement ( SEMI statement )* 
    ;

conditionalStatement
    : ifStatement
    | caseStatement
    ;
//---------
ifStatement
    : IF expression THEN statement
      (
     ELSE statement
    )?
    ;

caseStatement 
    : CASE expression OF
        caseListElement ( SEMI caseListElement )* SEMI?
      ( ELSE statements )?
      END
    ;

caseListElement
    : constant COLON statement
    ;

//pętle
loopStatement
    : whileStatement
    | forStatement
    ;

whileStatement
    : WHILE expression DO statement
    ;

forStatement
    : FOR identifier ASSIGN forList DO statement
    ;

forList
    : initialValue rel=(TO | DOWNTO) finalValue
    ;

initialValue
    : expression
    ;

finalValue
    : expression
    ;

//biale znaki
WS      : ( ' '
    |  '\t'
    |  '\f'
    // nowe linie
    |  (  '\r\n'
      |  '\r'
      |  '\n'
      )
    )
    -> skip
  ;

COMMENT_1
        :   '(*'
       (
         { _input.LA(2) != ')' }? '*'
           |   ~('*') 
       )*
          '*)'  
    -> skip
  ;

COMMENT_2
        :  '{'
        (  ~('}') )*
           '}'
    -> skip
  ;

//zmienne
IDENT  :  ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*   
  ;

STRING_LITERAL
  : '\'' ('\'\'' | ~('\''))* '\''
  ;


NUM_INT
  : ('0'..'9')+
  ;

NUM_REAL
  : ('0'..'9')+ DOT ('0'..'9')+
  ;
