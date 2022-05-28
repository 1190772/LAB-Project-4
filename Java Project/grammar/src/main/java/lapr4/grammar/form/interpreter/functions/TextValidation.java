package lapr4.grammar.form.interpreter.functions;

public class TextValidation implements Validation<TextValidation> {

    private String answer;


    public TextValidation setAnswer(String answer){
        this.answer=answer;
        return this;
    }

    public boolean validate(int nLines,int nCharPerLine){
        boolean flag=true;
        if (nLines!=-1){
            String[] lines = answer.split("\n");
            flag&=lines.length<=nLines;
        }
        if (nCharPerLine!=-1){
            String[] lines = answer.split("\n");
            for (String line : lines){
                if(line.length()>nCharPerLine){
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }

    public boolean validate(){
        return validate(-1,-1);
    }







}
