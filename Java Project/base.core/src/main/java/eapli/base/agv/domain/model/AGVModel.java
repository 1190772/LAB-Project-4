package eapli.base.agv.domain.model;

import eapli.framework.domain.model.ValueObject;

import java.io.Serializable;

public class AGVModel implements ValueObject, Serializable, Comparable<AGVModel> {

    private String agvModel;

    public AGVModel(String model){
        this.agvModel=model;
    }

    protected AGVModel() {
    }

    @Override
    public int compareTo(AGVModel o) {
        return this.agvModel.compareTo(o.agvModel);
    }

}
