
//import org.antlr.v4.runtime.ParserRuleContext;
//import org.antlr.v4.runtime.tree.ErrorNode;
//import org.antlr.v4.runtime.tree.TerminalNode;
//
//    /**
//     * This class provides an empty implementation of {@link ValidatorListener},
//     * which can be extended to create a listener which only needs to handle a subset
//     * of the available methods.
//     */
//    public class ValidatorBaseListener implements ValidatorListener {
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterLoad(ValidatorParser.LoadContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitLoad(ValidatorParser.LoadContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterAttribution(ValidatorParser.AttributionContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitAttribution(ValidatorParser.AttributionContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterQuestion(ValidatorParser.QuestionContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitQuestion(ValidatorParser.QuestionContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterStart(ValidatorParser.StartContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitStart(ValidatorParser.StartContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterStringVal(ValidatorParser.StringValContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitStringVal(ValidatorParser.StringValContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterNumberVal(ValidatorParser.NumberValContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitNumberVal(ValidatorParser.NumberValContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterOptionalVal(ValidatorParser.OptionalValContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitOptionalVal(ValidatorParser.OptionalValContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterScaleVal(ValidatorParser.ScaleValContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitScaleVal(ValidatorParser.ScaleValContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterDateVal(ValidatorParser.DateValContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitDateVal(ValidatorParser.DateValContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterTimeVal(ValidatorParser.TimeValContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitTimeVal(ValidatorParser.TimeValContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterDateTimeVal(ValidatorParser.DateTimeValContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitDateTimeVal(ValidatorParser.DateTimeValContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterValidation(ValidatorParser.ValidationContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitValidation(ValidatorParser.ValidationContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterOptNameArg(ValidatorParser.OptNameArgContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitOptNameArg(ValidatorParser.OptNameArgContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterOptArg(ValidatorParser.OptArgContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitOptArg(ValidatorParser.OptArgContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterScaleNameArg(ValidatorParser.ScaleNameArgContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitScaleNameArg(ValidatorParser.ScaleNameArgContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterSclArg(ValidatorParser.SclArgContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitSclArg(ValidatorParser.SclArgContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterStrArg(ValidatorParser.StrArgContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitStrArg(ValidatorParser.StrArgContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterStrNameArg(ValidatorParser.StrNameArgContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitStrNameArg(ValidatorParser.StrNameArgContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterNumArg(ValidatorParser.NumArgContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitNumArg(ValidatorParser.NumArgContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterNumNameArg(ValidatorParser.NumNameArgContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitNumNameArg(ValidatorParser.NumNameArgContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterEnum(ValidatorParser.EnumContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitEnum(ValidatorParser.EnumContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterScaleVali(ValidatorParser.ScaleValiContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitScaleVali(ValidatorParser.ScaleValiContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterIsDate_Time(ValidatorParser.IsDate_TimeContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitIsDate_Time(ValidatorParser.IsDate_TimeContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterIsDate(ValidatorParser.IsDateContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitIsDate(ValidatorParser.IsDateContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterIsTime(ValidatorParser.IsTimeContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitIsTime(ValidatorParser.IsTimeContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterRegexVali(ValidatorParser.RegexValiContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitRegexVali(ValidatorParser.RegexValiContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterIgnrCase(ValidatorParser.IgnrCaseContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitIgnrCase(ValidatorParser.IgnrCaseContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterWord(ValidatorParser.WordContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitWord(ValidatorParser.WordContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterSentence(ValidatorParser.SentenceContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitSentence(ValidatorParser.SentenceContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterParagraph(ValidatorParser.ParagraphContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitParagraph(ValidatorParser.ParagraphContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterIsNumber(ValidatorParser.IsNumberContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitIsNumber(ValidatorParser.IsNumberContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterGreat(ValidatorParser.GreatContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitGreat(ValidatorParser.GreatContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterGreaterOrEqual(ValidatorParser.GreaterOrEqualContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitGreaterOrEqual(ValidatorParser.GreaterOrEqualContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterLesser(ValidatorParser.LesserContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitLesser(ValidatorParser.LesserContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterLesserOrEqual(ValidatorParser.LesserOrEqualContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitLesserOrEqual(ValidatorParser.LesserOrEqualContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterEqual(ValidatorParser.EqualContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitEqual(ValidatorParser.EqualContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterDifferent(ValidatorParser.DifferentContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitDifferent(ValidatorParser.DifferentContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterExact(ValidatorParser.ExactContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitExact(ValidatorParser.ExactContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterRange(ValidatorParser.RangeContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitRange(ValidatorParser.RangeContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterNotInRange(ValidatorParser.NotInRangeContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitNotInRange(ValidatorParser.NotInRangeContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterOptional(ValidatorParser.OptionalContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitOptional(ValidatorParser.OptionalContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterMultipleOptional(ValidatorParser.MultipleOptionalContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitMultipleOptional(ValidatorParser.MultipleOptionalContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterAtomicOptional(ValidatorParser.AtomicOptionalContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitAtomicOptional(ValidatorParser.AtomicOptionalContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterScale(ValidatorParser.ScaleContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitScale(ValidatorParser.ScaleContext ctx) { }
//
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void enterEveryRule(ParserRuleContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void exitEveryRule(ParserRuleContext ctx) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void visitTerminal(TerminalNode node) { }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation does nothing.</p>
//         */
//        @Override public void visitErrorNode(ErrorNode node) { }
//    }
//}
