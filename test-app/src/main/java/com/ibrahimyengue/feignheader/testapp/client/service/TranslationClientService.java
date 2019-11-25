package com.ibrahimyengue.feignheader.testapp.service;

import com.ibrahimyengue.feignheader.testapp.client.model.MessageResponse;
import com.ibrahimyengue.feignheader.testapp.client.proxy.TranslationClient;
import com.ibrahimyengue.feignheader.testapp.model.TestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;

@Service
public class TranslationClientService {

    @Autowired
    private TranslationClient client;

    public TestResponse get(String language) {
        MessageResponse messageResponse = client.message(language);
        String message = messageResponse.getMessage();
        return new TestResponse(message);
    }

}
