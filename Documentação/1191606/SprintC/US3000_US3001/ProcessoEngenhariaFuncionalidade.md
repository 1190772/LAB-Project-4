# US3000 / US3001
=======================================

## Requirements

As Project Manager, I want the team to specify a grammar allowing to express several kinds of questionnaires.

As Sales Manager, I want to create a new questionnaire to be further answered by customers meeting the specified criteria (e.g.: have ordered a given product; belong to a given age group).


## Analysis / Business Rules

**Instructions:**

The grammar should be conceived having in mind its reusability/applicability on other application domains than the one of this project (e.g., pedagogical questionnaires).

The set of questions/answers composing the questionnaire should be expressed and validated (parsed) using the grammar being developed for this purpose.

Create a new survey. A survey is characterized by an alphanumeric code, a description, the period
(in days) it will be performed, the intended questionnaire and a set of rules that allows the system
to determine the survey target audience. Some examples of those rules are: 

* customers that have ordered a given product during a given period; 

* customers that have ordered any product of a given brand or category during a given period;

* customers of a given gender; 

* customers that fit on a given age group (e.g.: 20-29).

From client anwers:

* alphanumeric code, a description, the period (in days) it will be performed and a set of rules that allows the system to determine the survey target audience;

* the intended questionnaire, i.e. the title, the welcome message, sections and questions.


For demonstration purpose, a draft of possible questionnaire for market prospection regarding alimentary products is briefly outlined.
Regarding the primary information (i.e.: id of the survey, title, initial message, and final message), one can consider the examples provided on Table 1. Concerning the questionnaire sections, one could
organize the questions in eight distinct sections as follows:

### Question Types and Examples

**Questions adopted in any questionnaire are envisioned to be of one of the following types:**

* Free-Text: it means the person answers the question by typing some text. In some
case, it is necessary to limit the amount of text (e.g.: single line, multiple lines setting a maximum
number of chars per line).

* Numeric: it means the person answers the question by typing a numeric value. By default, no
decimals are allowed. When no decimals are allowed, the question might be used to determine
the repeatability of a section.

* Single-Choice: it means the person answers the question by selection one (and just one) of the provided options.
Each option consists of a value (not showed to the person) and a description. At least to option must be specified.

* Single-Choice with input value: very similar to the “single choice” but the last option, if selected,
implies that the person must type a numeric value or a free text.

* Multiple-Choice: very similar to the “single choice”, but instead of selection just one, the
answering person might select more than one . Sometimes, it is necessary to set a
limit (e.g., maximum 3 option can be selected). By default, there is no limit.

* Multiple-Choice with input value: very similar to the “multiple choice”, but the last option, if
selected, implies that the person must type a numeric value or a free text.

* Sorting Options: given two or more option the person answers the question by sorting the options
as desired and in accordance with the instructions provided. By default, no order is assumed.

* Scaling Options: it means the person answers the question by selecting a value of a given scale
(e.g.: unimportant, neutral, important) to each of the specified options. The adopted
scale is the same for all the options of a given question.

### Questionnaire Outline

### Survey 1:

#### Section 1: 

With a title “Basic Data” and consisting of three questions:

(a) “Q1” about the name; This section is mandatory.

(b) another one “Q2” about the gender (s)he has; This only one choice answering.

(c) an optional one “Q3” regarding the age of the person answering. This only one choice answering.


#### Section 2:

It would consist of several questions concerning the “Address”:

(a) “Q1” about the street name.

(b) “Q2” about the door number.

(c) “Q3” about the city; This section is mandatory.

(d) “Q4” about the country; This section is mandatory.

#### Section 3:

It would consist of several questions concerning the “Education”:

(a) “Q1” about the level of degree of the person.

(b) “Q2” about the area of interest of the person. This is a free answer type.

(c) “Q3” about the experience in the area. This only one choice answering.


### Survey 2:

#### Section 1:

With a title “General Yogurt Questions” and consisting of three questions:

(a) “Q1” about the lactose tolerancy; This only one choice answering.

(b) another one “Q2” about how many yogurts are eaten per day; This section is mandatory.

(c) “Q3” regarding the preference of the Yogurt type. This only one choice answering.


#### Section 2:

It would consist of several questions concerning the "Marketing" scenario:

(a) “Q1” about the type of yogurt container. This only one choice answering.

(b) “Q2” about the place where the yogurts are bought. This only one choice answering.






