package first_site.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginUserController {

    @GetMapping("/login_user")
    public String loginUser(){
        return "login_user";
    }

}
