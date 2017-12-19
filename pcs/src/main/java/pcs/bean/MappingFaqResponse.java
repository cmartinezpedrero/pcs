package pcs.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MappingFaqResponse {

    private ArrayList<HashMap<String, List<ConditionsFaqs>>> mappings;


    public ArrayList<HashMap<String, List<ConditionsFaqs>>> getMappings() {
        return mappings;
    }

    public void setMappings(ArrayList<HashMap<String, List<ConditionsFaqs>>> mappings) {
        this.mappings = mappings;
    }

}
