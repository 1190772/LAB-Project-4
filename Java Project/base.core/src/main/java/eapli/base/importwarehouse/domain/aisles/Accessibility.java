package eapli.base.importwarehouse.domain.aisles;

public class Accessibility {
    private char direction;
    private char orientation;

    private Accessibility(char direction,char orientation){
        this.direction=direction;
        this.orientation=orientation;
    }

    public static Accessibility of(String accessibility){
        if (accessibility==null || accessibility.isBlank()){
            throw new IllegalArgumentException("Accessibility cannot be null or black");
        }
        if (accessibility.length()!=2){
            throw new IllegalArgumentException("Accessibility must be a char between 'w' and 'l', and another char between '+' or '-'");
        }
        char dir = accessibility.charAt(0);
        char or = accessibility.charAt(1);
        if (dir!='w' || dir !='l' || or!='+' || or!='-'){
            throw new IllegalArgumentException("Accessibility must be a char between 'w' and 'l', and another char between '+' or '-'");
        }
        return new Accessibility(dir,or);
    }

    public char getDirection() {
        return direction;
    }

    public char getOrientation() {
        return orientation;
    }
}
