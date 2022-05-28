package lapr4.grammar.form.interpreter.functions;

public class IsNumericValidation implements Validation<IsNumericValidation>{

    private String answer;


    public IsNumericValidation setAnswer(String answer){
        this.answer=answer;
        return this;
    }
    
    
    public boolean validate(){
        try{
            Double.parseDouble(answer);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    
    
}
