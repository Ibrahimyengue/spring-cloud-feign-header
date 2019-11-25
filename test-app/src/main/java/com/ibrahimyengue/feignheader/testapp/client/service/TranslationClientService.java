package com.ibrahimyengue.feignheader.testapp.client.service;

import com.ibrahimyengue.feignheader.testapp.client.model.MessageResponse;
import com.ibrahimyengue.feignheader.testapp.client.proxy.TranslationClient;
import com.ibrahimyengue.feignheader.testapp.model.TestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranslationClientService {

    @Autowired
    private TranslationClient client;

    public TestResponse getLanguage(String language) {
        MessageResponse messageResponse = client.message(language);
        String message = messageResponse.getMessage();
        return new TestResponse(message);
    }

}
