package com.ibrahimyengue.feignheader.testapp.service;

import com.ibrahimyengue.feignheader.testapp.client.service.TranslationClientService;
import com.ibrahimyengue.feignheader.testapp.model.TestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;

@Service
public class TestService {

    @Autowired
    private TranslationClientService client;


    public TestResponse getLanguage(String language) {
        TestResponse messageResponse = client.getLanguage(language);
        return new TestResponse(messageResponse.getValue());
    }
}
