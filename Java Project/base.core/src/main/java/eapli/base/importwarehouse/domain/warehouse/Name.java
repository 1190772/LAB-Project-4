package eapli.base.importwarehouse.domain.warehouse;

import javax.persistence.Embeddable;

@Embeddable
public class Name {
    private String name;

    private Name(String name){
        this.name=name;
    }

    public Name() {

    }

    public static Name of(String name){
        return new Name(name);
    }

    public String name(){
        return name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }
}
