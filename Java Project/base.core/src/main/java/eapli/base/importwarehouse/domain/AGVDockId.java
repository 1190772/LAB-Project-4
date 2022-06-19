package eapli.base.importwarehouse.domain;

public class AGVDockId {
    private String id;

    public AGVDockId(String id){
        this.id=id;
    }

    public String id(){
        return id;
    }

    @Override
    public String toString() {
        return "AGVDockId{" +
                "id='" + id + '\'' +
                '}';
    }
}
