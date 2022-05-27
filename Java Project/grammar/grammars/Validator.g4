grammar Validator;


start: include atrribution* (section | question)*;

atrribution: NAME '<-' val;


val: INT | optional;
question: 'Q'opt='x'?'<-''{' INT',' INT','validation'}';
section: 'S'opt='x'?'<-''{'INT'}';


intArg: NAME | INT;
optionalArg: NAME| optional;


validation: 'text'('('')'|'('intArg','intArg')')
           | 'isInt''()'
           | 'isNumeric''()'
           | 'singleChoice''('optionalArg')'
           | 'multipleChoice''('optionalArg (',' intArg) ')'
           | 'singleChoiceT''('optionalArg')'
           | 'multipleChoiceT''('optionalArg (',' intArg) ')'
           | 'sort''('optionalArg')'
           | 'scale''('intArg ','optionalArg')'
           ;


include: '#include' NAME;


optional: '|' (STRING ',')+ STRING '|';


fragment LowerChar: [a-z];
fragment UpperChar: [A-Z];
fragment Digit: [0-9];
fragment Special: [_.-];
NAME: (LowerChar|UpperChar) (LowerChar|UpperChar|Digit|Special)*;
STRING : '"' ~'"'* '"' ;
INT : [1-9]Digit* | '0';


WS :[ \t\r\n]->skip;