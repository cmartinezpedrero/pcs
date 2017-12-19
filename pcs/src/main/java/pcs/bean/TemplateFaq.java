package pcs.bean;

import java.util.ArrayList;

public class TemplateFaq {

    private String location;
    private String code;
    private ArrayList<FaqResponse> faqs;


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<FaqResponse> getFaqs() {
        return faqs;
    }

    public void setFaqs(ArrayList<FaqResponse> faqs) {
        this.faqs = faqs;
    }
}
