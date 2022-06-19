package eapli.base.surveymanagement.application;

import eapli.base.surveymanagement.application.surveyGrammarBaseVisitor;
import eapli.base.surveymanagement.application.surveyGrammarParser;

public class SurveyVisitor extends surveyGrammarBaseVisitor<Integer> {

    @Override
    public Integer visitProg(surveyGrammarParser.ProgContext ctx) {
        return visit(ctx.survey());
    }


}
