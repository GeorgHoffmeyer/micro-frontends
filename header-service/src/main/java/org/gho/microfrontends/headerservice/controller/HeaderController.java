package org.gho.microfrontends.headerservice.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HeaderController {
    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping("/")
    @CrossOrigin("http://localhost:8080")
    public String header(Map<String, Object> model) {
        model.put("message", this.message);
        return "header";
    }


}