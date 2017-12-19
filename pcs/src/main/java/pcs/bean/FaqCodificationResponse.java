package pcs.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FaqCodificationResponse {


    public TemplateFaq templateFaq;
    public MappingFaqResponse mappingFaq;


    public TemplateFaq getTemplateFaq() {
        return templateFaq;
    }

    public void setTemplateFaq(TemplateFaq templateFaq) {
        this.templateFaq = templateFaq;
    }

    public MappingFaqResponse getMappingFaq() {
        return mappingFaq;
    }

    public void setMappingFaq(MappingFaqResponse mappingFaq) {
        this.mappingFaq = mappingFaq;
    }

}
