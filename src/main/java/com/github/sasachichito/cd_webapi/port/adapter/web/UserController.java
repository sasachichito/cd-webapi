package com.github.sasachichito.cd_webapi.port.adapter.web;

import com.github.sasachichito.cd_webapi.application.UserService;
import com.github.sasachichito.cd_webapi.domain.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(method= RequestMethod.POST, value="{name}")
    @ResponseStatus(value=HttpStatus.OK)
    public void save(@PathVariable String name) {
        this.userService.saveUser(name);
    }

    @RequestMapping(method= RequestMethod.GET, value="{name}")
    public User ofName(@PathVariable String name) {
        // TODO convert
        return this.userService.ofName(name);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<User> all() {
        return userService.getAll();
    }
}
