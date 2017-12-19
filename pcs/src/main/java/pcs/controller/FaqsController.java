package pcs.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;
import pcs.bean.FaqCodificationRequest;
import pcs.bean.FaqCodificationResponse;
import pcs.service.FaqsService;

import javax.annotation.Resource;

@RestController
public class FaqsController {

    @Resource(name="faqsService")
    private FaqsService faqsService;

    final static Logger logger = Logger.getLogger("FaqsController.class");


    @RequestMapping(value = "/faqs/codification/v1", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody

    public FaqCodificationResponse faqsCodification(
            @RequestBody String faqRequest) throws Exception  {
        FaqCodificationResponse result = null;
        ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            FaqCodificationRequest faqCodificationRequest = objectMapper.readValue(faqRequest, FaqCodificationRequest.class);
            if (faqCodificationRequest != null){
                try {
                    result = faqsService.formatFaqs(faqCodificationRequest);
                }
                catch (Exception ex){
                    throw new Exception(ex);
                }
            }
            else{
                result = null;
            }
        } catch (Exception e) {
            logger.error("Se ha producido un error deserializando el body de la peticion.");

        }
        return result;
    }
}
