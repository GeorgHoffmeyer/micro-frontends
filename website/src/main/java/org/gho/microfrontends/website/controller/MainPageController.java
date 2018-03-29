package org.gho.microfrontends.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainPageController {

    @RequestMapping("/")
    public String mainPage(@RequestParam(name = "webcomponents", defaultValue = "false") String webcomponents, Map<String, Object> model) {

        if("true".equals(webcomponents))
            return "main_webcomponents";

        return "main";
    }
}
