package pcs.service;

import pcs.bean.FaqCodificationRequest;
import pcs.bean.FaqCodificationResponse;

public interface FaqsService {

    public FaqCodificationResponse formatFaqs(FaqCodificationRequest faqCodificationRequest) throws Exception;

}
