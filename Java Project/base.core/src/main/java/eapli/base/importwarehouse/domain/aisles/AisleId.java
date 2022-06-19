package eapli.base.importwarehouse.domain.aisles;

public class AisleId {
    private Long id;

    public AisleId(long id){
        this.id=id;
    }

    public long id(){
        return id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "AisleId{" +
                "id=" + id +
                '}';
    }
}
