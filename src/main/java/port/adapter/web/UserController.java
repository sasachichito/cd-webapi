package port.adapter.web;

import application.UserService;
import domain.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(method= RequestMethod.POST)
    public void save(@RequestParam(value="name") String userName) {
        this.userService.saveUser(userName);
    }

    @RequestMapping(method= RequestMethod.GET)
    public User ofName(@RequestParam(value="name") String userName) {
        return this.userService.ofName(userName);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<User> all() {
        return userService.getAll();
    }
}
