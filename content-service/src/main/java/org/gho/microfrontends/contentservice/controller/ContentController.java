package org.gho.microfrontends.contentservice.controller;

import org.gho.microfrontends.model.User;
import org.gho.microfrontends.model.ContentFormResult;

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

    private static List<User> users = new ArrayList<>();
    static {

        User user1 = new User();
        user1.setId(1);
        user1.setName("User 1");

        User user2 = new User();
        user2.setId(2);
        user2.setName("User 2");

        users.add(user1);
        users.add(user2);

    }

    @RequestMapping(value="/", method= RequestMethod.GET)
    @CrossOrigin("http://localhost:8080")
    public String content(Map<String, Object> model) {

        model.put("UserList", users);
        model.put("contentFormResult", new ContentFormResult());

        return "content";
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    @CrossOrigin("http://localhost:8080")
    public RedirectView content(ContentFormResult result) {

        String userId = result.getUserId();

        for(User u : users) {
            if(u.getId().equals(userId)) {
                System.out.println("User " + u.getName() + " with id " + userId + " selected.");
            }
        }

        return new RedirectView("http://localhost:8080");//redirct:http://localhost:8080";
    }
}
