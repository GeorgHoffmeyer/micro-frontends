package org.gho.contentService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class ContentController {

    @RequestMapping("/")
    @CrossOrigin("http://localhost:8080")
    public String content(Map<String, Object> model) {
        List<String> users = new ArrayList<>();
        users.add("User 1");
        users.add("User 2");

        model.put("UserList", users);

        return "content";
    }
}
