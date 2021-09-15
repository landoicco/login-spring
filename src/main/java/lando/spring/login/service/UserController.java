package lando.spring.login.service;

import lando.spring.login.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @GetMapping("/")
    public String showUser(Model model) {

        List<User> users = (List<User>) userRepo.findAll();

        model.addAttribute("users", users);
        return "index";
    }

}
