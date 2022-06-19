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

prog: survey;


// All Rules

surveyID: (NUMBER+ '_' STRING+) NEWLINE    #survID;

title: (SENTENCE) NEWLINE    #tlt;

message: SENTENCE NEWLINE  #msg;


/*answer: STRING;

choice: (id answer)+;

numeric: NUMBER+;

free: STRING*;

questionType: TYPE (free|numeric|choice) NEWLINE;

questionQ: SENTENCE'?'NEWLINE;

question: (id questionType OBLIGATORINESS questionQ message?) | (id questionType condition questionQ message?);

condition: 'Dependent about the question: ' id 'and on the section: ' id NEWLINE;

section: id title message question+ NEWLINE;
*/

section: SECTION title align+       #sction;

align: ALIGN STRING+ MANDATORY? NEWLINE #openAnswer
       | ALIGN STRING+ MANDATORY? (OPTION CHOICEMUL? || OPTION) NEWLINE option+  #optionAnswer
       | ALIGN STRING+ MANDATORY? FREE? NEWLINE free*   #freeAnswer
       ;

option: OPTION (STRING|NUMBER)+ ';' NEWLINE  #normalOption
        | OPTION STRING ':' NEWLINE          #otherOption
        ;

free: (SYMBOLS|STRING|NUMBER|ALFANUMERIC)+ NEWLINE    #freeOption;


survey: surveyID title message section+ message NEWLINE;


// Tokens

NUMBER: [0-9]+;

LETTER: [a-zA-Z];

STRING: LETTER+;

ALFANUMERIC: STRING | NUMBER;

SPACE:' ';

SENTENCE: STRING (SPACE STRING)*;

NEWLINE: ('\r'?'\n')+;

SECTION: NUMBER+'-';

ALIGN: LETTER+')';

OPTION: ('i''x'|'i''v'|(('v')?('i'|'ii'|'iii')?))'.';

CHOICEMUL: '>';
MANDATORY: '*';
OPTIONAL: 'x';
FREE: 'free';

//OBLIGATORINESS: 'obligatory' | 'optional' | 'condition dependent';

//TYPE: 'Numeric' | 'Free Text' | 'Sorting' | 'Multiple Choice' | 'Single Choice' | 'Multiple Choice Input Value' | 'Single Choice Input Value' | 'Scaling';

SYMBOLS : ('['|']'|','|'?');

