package eapli.base.importwarehouse.domain.warehouse;

public class Name {
    private String name;

    private Name(String name){
        this.name=name;
    }

    public static Name of(String name){
        return new Name(name);
    }

    public String name(){
        return name;
    }

}
