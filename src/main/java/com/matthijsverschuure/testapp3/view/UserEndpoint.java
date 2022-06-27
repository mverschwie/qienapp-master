package com.matthijsverschuure.testapp3.view;

import com.matthijsverschuure.testapp3.controller.UserService;
import com.matthijsverschuure.testapp3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/user")
public class UserEndpoint {
    @Autowired
    UserService userService;

    @GetMapping("/all")
    public Iterable<User> haalAlleUsers() {
        return userService.haalAlleUsers();

    }
    @PostMapping("/nieuwe-user")
    public User nieuweUser(@RequestBody User user) {
        return userService.nieuweUser(user);
    }
}



