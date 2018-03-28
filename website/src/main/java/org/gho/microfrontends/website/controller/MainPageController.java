package org.gho.microfrontends.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class MainPageController {

    @RequestMapping
    public String mainPage(Map<String, Object> model) {

        return "main";
    }
}
