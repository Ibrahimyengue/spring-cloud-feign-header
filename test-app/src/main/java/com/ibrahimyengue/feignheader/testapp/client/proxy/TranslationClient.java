package com.ibrahimyengue.feignheader.testapp.client.proxy;

import com.ibrahimyengue.feignheader.testapp.client.model.MessageResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "translation", url = "http://localhost:9001")
public interface TranslationClient {
    @RequestMapping("/message")
    MessageResponse message(@RequestHeader("Accept-Language") String language);
}
