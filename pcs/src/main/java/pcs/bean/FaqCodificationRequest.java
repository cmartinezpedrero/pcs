package pcs.bean;

import java.util.ArrayList;
import java.util.HashMap;

public class FaqCodificationRequest {

    private String location;

    private String locationName;

    private HashMap<String, ArrayList<Faq>> faqs;



    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocationName() {
        return locationName;
    }
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public HashMap<String, ArrayList<Faq>> getFaqs() {
        return faqs;
    }

    public void setFaqs(HashMap<String, ArrayList<Faq>> faqs) {
        this.faqs = faqs;
    }

}
