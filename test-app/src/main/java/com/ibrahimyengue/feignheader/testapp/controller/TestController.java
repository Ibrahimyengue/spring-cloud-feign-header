package com.ibrahimyengue.feignheader.testapp.controller;

import com.ibrahimyengue.feignheader.testapp.model.TestResponse;
import com.ibrahimyengue.feignheader.testapp.client.service.TranslationClientService;
import com.ibrahimyengue.feignheader.testapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping
    public TestResponse getLanguage(@RequestHeader("Accept-Language") String language) {
        TestResponse messageResponse = testService.getLanguage(language);
        return new TestResponse(messageResponse.getValue());
    }
}

