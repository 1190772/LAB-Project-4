package eapli.base.importwarehouse.domain.aisles;

public class AisleRowId {
    private long id;

    public AisleRowId(long id){
        this.id=id;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "AisleRowId{" +
                "id=" + id +
                '}';
    }
}
