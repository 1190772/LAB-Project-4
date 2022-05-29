grammar Validator;


start: include atrribution* (section | question)*;

atrribution: NAME '<-' val;


val: INT #intV| optional #intO;
question: 'Q'opt='x'?'<-''{' secIndex=INT',' qIndex=INT','validation'}';
section: 'S'opt='x'?'<-''{'INT'}';


intArg: NAME #intVar | INT #intVal;
optionalArg: NAME #optVar| optional #optVal;


validation: 'text'('('')'|'('nLines=intArg','nCharPerLine=intArg')') #textV
           | 'isInt''()' #isIntV
           | 'isNumeric''()' #isNumericV
           | 'singleChoice''('opt=optionalArg')' #singleChoiceV
           | 'multipleChoice''('opt=optionalArg (',' maxChoices=intArg)? ')' #multipleChoiceV
           | 'singleChoiceT''('opt=optionalArg')' #singleChoiceTV
           | 'multipleChoiceT''('opt=optionalArg (',' maxChoices=intArg)? ')' #multipleChoiceTV
           | 'sort''('opt=optionalArg')' #sortV
           | 'scale''('sec=intArg ','opt=optionalArg')' # scaleV
           ;


include: '#include' formName=NAME;


optional: '|' optionalBody '|';
optionalBody: atom=STRING ',' optionalBody #optBodyMultiple
            | atom=STRING #optBodyAtom
            ;


fragment LowerChar: [a-z];
fragment UpperChar: [A-Z];
fragment Digit: [0-9];
fragment Special: [_.-];
NAME: (LowerChar|UpperChar) (LowerChar|UpperChar|Digit|Special)*;
STRING : '"' ~'"'* '"' ;
INT : [1-9]Digit* | '0';


WS :[ \t\r\n]->skip;