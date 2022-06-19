grammar surveyGrammar;

@parser::header {
    import java.util.*;
    import java.lang.*;
    import java.io.*;
}

@rulecatch{
        catch(RecognitionException e){
        throw e;
        }
}

@parser::members {


}

prog: survey;


// All Rules

survey: surveyID title message section+ finalMessage  newline;

newline: NEWLINE+   #prgf;

surveyID: NUMBER+ '_' title    #survID;

title: STRING+ newline    #tlt;

message: title    #msg;

finalMessage: STRING+        #finalMsg;

section: SECTION title align+       #sction;

align: ALIGN STRING+ MANDATORY? newline    #openAnswer
       | ALIGN STRING+ MANDATORY? (OPTION CHOICEMUL? || OPTION) newline option+  #optionAnswer
       | ALIGN STRING+ MANDATORY? FREE? newline free*   #freeAnswer
       ;

option: OPTION  (STRING|NUMBER)+ ';' newline  #normalOption
        | OPTION STRING ':' newline          #otherOption
        ;

free: (SYMBOLS|STRING|NUMBER|ALFANUMERIC)+ newline    #freeOption;


// Tokens

NUMBER: [0-9]+;

//LETTER: [a-zA-Z];

STRING: [a-zA-Z]+;

ALFANUMERIC: STRING | NUMBER;



//SENTENCE: STRING (' ' STRING)*;

NEWLINE: '\r'?'\n';

SECTION: NUMBER+'-';

ALIGN: [a-z]+')';

OPTION: ('i''x'|'i''v'|(('v')?('i'|'ii'|'iii')?))'.';

CHOICEMUL: '>';
MANDATORY: '*';
OPTIONAL: 'x';
FREE: 'free';

SYMBOLS : ('['|']'|','|'?');

WS :[ \t\r\n]->skip;

