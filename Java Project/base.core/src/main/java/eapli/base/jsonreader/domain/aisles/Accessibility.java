package eapli.base.jsonreader.domain.aisles;

public class Accessibility {
    private char direction;
    private char orientation;

    private Accessibility(char direction,char orientation){
        this.direction=direction;
        this.orientation=orientation;
    }

    public static Accessibility of(String accessibility){
        if (accessibility==null || accessibility.isBlank()){
            throw new IllegalArgumentException("Accessibility cannot be null");
        }
        if (accessibility.length()!=2 || ){
            throw new IllegalArgumentException("Accessibility must be a char between 'w' and 'l', and another char between '+' or '-'");
        }


        return new Accessibility();
    }


}
