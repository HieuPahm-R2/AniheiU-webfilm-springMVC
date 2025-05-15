package vn.hust.AniheiU.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {
    
    @GetMapping("")
    public String register() {
        return "auth/register.jsp";
    }
    @PostMapping("/create-user")
    public String createUser() {

        return "redirect:/login";
    
}
}
