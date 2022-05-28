package lapr4.grammar.form.interpreter.functions;

public class IsIntValidation implements Validation{

    private String answer;


    public IsIntValidation setAnswer(String answer){
        this.answer=answer;
        return this;
    }

    public boolean validate(){
        try{
            double d =Double.parseDouble(answer);
            int i = Integer.parseInt(answer);
            return d==i;
        }catch (NumberFormatException e){
            return false;
        }
    }




}
