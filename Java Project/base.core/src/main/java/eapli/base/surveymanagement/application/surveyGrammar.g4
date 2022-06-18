grammar surveyGrammar;

prog: survey;


// All Rules

surveyID: (NUMBER+ '_' STRING+) | (STRING+ '_' NUMBER+);

title: (STRING | SENTENCE) NEWLINE;

message: SENTENCE NEWLINE;

id: NUMBER + NEWLINE;

answer: STRING;

choice: (id answer)+;

numeric: NUMBER+;

free: STRING*;

questionType: TYPE (free|numeric|choice) NEWLINE;

questionQ: SENTENCE'?'NEWLINE;

question: (id questionType OBLIGATORINESS questionQ message?) | (id questionType condition questionQ message?);

condition: 'Dependent about the question: ' id 'and on the section: ' id NEWLINE;

section: id title message question+ NEWLINE;

survey: surveyID NEWLINE title message? section+ message;


// Tokens

NUMBER: [0-9];

LETTER: [A-Za-z];

STRING: LETTER+;

ALFANUMERIC: STRING | NUMBER;

SPACE:' ';

SENTENCE: STRING (SPACE STRING)*;

NEWLINE: [\n]+;

OBLIGATORINESS: 'obligatory' | 'optional' | 'condition dependent';

TYPE: 'Numeric' | 'Free Text' | 'Sorting' | 'Multiple Choice' | 'Single Choice' | 'Multiple Choice Input Value' | 'Single Choice Input Value' | 'Scaling';


