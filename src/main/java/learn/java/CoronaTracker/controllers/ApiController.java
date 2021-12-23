package learn.java.CoronaTracker.controllers;

import learn.java.CoronaTracker.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/user")
    public User userController(@RequestParam(value="userId", defaultValue = "0") String userId) {
        User user = new User(userId, "Sanchit", "Bansal", "8053844024");
        return user;
    }
}
