package org.gho.contentService.controller;

import org.gho.contentService.model.ContentFormResult;
import org.gho.contentService.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class ContentController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    @CrossOrigin("http://localhost:8080")
    public String content(Map<String, Object> model) {
        List<User> users = new ArrayList<>();

        User user1 = new User();
        user1.setId("1");
        user1.setName("User 1");

        User user2 = new User();
        user2.setId("2");
        user2.setName("User 2");

        users.add(user1);
        users.add(user2);

        model.put("UserList", users);
        model.put("contentFormResult", new ContentFormResult());

        return "content";
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    @CrossOrigin("http://localhost:8080")
    public RedirectView content(ContentFormResult result) {
        System.out.println("Result" + result.getUserId());

        return new RedirectView("http://localhost:8080");//redirct:http://localhost:8080";
    }
}
