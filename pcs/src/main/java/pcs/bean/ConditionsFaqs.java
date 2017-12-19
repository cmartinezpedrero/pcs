package pcs.bean;

import java.util.HashMap;
import java.util.List;

public class ConditionsFaqs {

    private List<HashMap<String,String>> conditions;
    private String value;



    public List<HashMap<String, String>> getConditions() {
        return conditions;
    }

    public void setConditions(List<HashMap<String, String>> conditions) {
        this.conditions = conditions;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
