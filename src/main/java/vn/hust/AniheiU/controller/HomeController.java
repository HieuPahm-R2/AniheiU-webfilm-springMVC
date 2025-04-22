package vn.hust.AniheiU.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {
    @GetMapping("/")
    public String GetHome(Model model) {
        model.addAttribute("mess", "hello");
        return "Home/home.jsp";
    }
}
