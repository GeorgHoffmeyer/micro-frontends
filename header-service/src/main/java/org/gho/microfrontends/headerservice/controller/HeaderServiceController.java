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

    @RequestMapping("/header")
    @CrossOrigin("http://localhost:8080")
    public String header(@RequestParam(name = "webcomponent", defaultValue = "false") String webcomponent, Map<String, Object> model) {
        if("true".equals(webcomponent))
            return "header_webcomponent";

        return "header";
    }

    @RequestMapping("/footer")
    @CrossOrigin("http://localhost:8080")
    public String footer(@RequestParam(name = "webcomponent", defaultValue = "false") String webcomponent, Map<String, Object> model) {
        if("true".equals(webcomponent))
            return "footer_webcomponent";

        return "footer";
    }

}