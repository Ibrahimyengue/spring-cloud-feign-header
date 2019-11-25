package com.ibrahimyengue.feignheader.translator.controller;

import com.ibrahimyengue.feignheader.translator.model.MessageResponse;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Locale;

@RestController("/message")
public class TranslationController {

    @RequestMapping
    public MessageResponse message(@RequestHeader(value = "Accept-Language") String language) {

        String message = "english";

        if (Locale.GERMANY.equals(Locale.forLanguageTag(language))) {
            message = "german";
        }
        return new MessageResponse(message);
    }
}



