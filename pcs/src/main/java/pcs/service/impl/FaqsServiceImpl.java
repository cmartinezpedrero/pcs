package pcs.service.impl;

import org.springframework.stereotype.Service;
import pcs.bean.*;
import pcs.service.FaqsService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service("faqsService")
public class FaqsServiceImpl implements FaqsService {

    public FaqCodificationResponse formatFaqs(FaqCodificationRequest faqCodificationRequest) throws Exception {

        FaqCodificationResponse result = new FaqCodificationResponse();

        //Calculamos el ContextualAsisstanceTemplates.json
        TemplateFaq template = new TemplateFaq();
        template.setCode("faqs");
        template.setLocation(faqCodificationRequest.getLocation());
        ArrayList<FaqResponse> faqs = new ArrayList<FaqResponse>();
        MappingFaqResponse map = new MappingFaqResponse();
        ArrayList<HashMap<String, List<ConditionsFaqs>>> mappingsId2 = new ArrayList<HashMap<String, List<ConditionsFaqs>>>();


        for (int i = 0; i < faqCodificationRequest.getFaqs().size(); i++){
            FaqResponse faq = new FaqResponse();
            faq.setId("@@"+faqCodificationRequest.getLocationName()+"Faq"+(i+1)+"Id");
            faq.setTitle("@@"+faqCodificationRequest.getLocationName()+"Faq"+(i+1)+"Title");
            faq.setCallbackId("1");
            faqs.add(faq);

            //Calculamos el ContextualAsisstanceMappings.json
            ArrayList<ConditionsFaqs> conditionsListId = new ArrayList<ConditionsFaqs>();
            ArrayList<ConditionsFaqs> conditionsListTitle = new ArrayList<ConditionsFaqs>();
            List<Faq> faqsList = faqCodificationRequest.getFaqs().get("faq"+(i+1));

            for (int x = 0; x < faqsList.size(); x++){
                //Calculamos la FaqId
                HashMap<String, String> conditionsMapId = new HashMap<String, String>();
                conditionsMapId.put("lang",faqsList.get(x).getLang());
                List<HashMap<String, String>> conditionsMapListId = new ArrayList<HashMap<String, String>>();
                conditionsMapListId.add(conditionsMapId);
                ConditionsFaqs conditionsId = new ConditionsFaqs();
                conditionsId.setConditions(conditionsMapListId);
                conditionsId.setValue(faqsList.get(x).getId());

                conditionsListId.add(conditionsId);

                //Calculamos la FaqTitle
                HashMap<String, String> conditionsMapTitle = new HashMap<String, String>();
                conditionsMapTitle.put("lang",faqsList.get(x).getLang());
                List<HashMap<String, String>> conditionsMapListTitle = new ArrayList<HashMap<String, String>>();
                conditionsMapListTitle.add(conditionsMapTitle);
                ConditionsFaqs conditionsTitle = new ConditionsFaqs();
                conditionsTitle.setConditions(conditionsMapListTitle);
                conditionsTitle.setValue(faqsList.get(x).getContent());

                conditionsListTitle.add(conditionsTitle);
            }

            HashMap<String, List<ConditionsFaqs>> mappingsId = new HashMap<String, List<ConditionsFaqs>>();
            mappingsId.put(faqCodificationRequest.getLocationName()+"Faq"+(i+1)+"Id",conditionsListId);
            mappingsId.put(faqCodificationRequest.getLocationName()+"Faq"+(i+1)+"Title",conditionsListTitle);

            mappingsId2.add(mappingsId);
        }
        map.setMappings(mappingsId2);
        result.setMappingFaq(map);
        template.setFaqs(faqs);
        result.setTemplateFaq(template);

        return result;
    }

}
