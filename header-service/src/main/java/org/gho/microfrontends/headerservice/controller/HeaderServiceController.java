package org.gho.microfrontends.headerservice.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HeaderServiceController {
    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping("/")
    @CrossOrigin("http://localhost:8080")
    public String headerWebcomponent(Map<String, Object> model) {
        model.put("message", this.message);
        return "header_webcomponent";
    }

    @RequestMapping("/header")
    public String headerESI(Map<String, Object> model) {

        return "header";
    }


}