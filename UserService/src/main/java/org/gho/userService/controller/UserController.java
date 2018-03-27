package org.gho.userService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping("/users")
    public List<User> getUsers() {
        return new ArrayList<User>();
    }
}
