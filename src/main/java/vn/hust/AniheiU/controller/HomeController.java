package vn.hust.AniheiU.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.hust.AniheiU.service.implement.FilmService;

@Controller
@RequestMapping
public class HomeController {
    @Autowired
    private FilmService filmService;

    @GetMapping("/")
    public String GetHome(Model model) {
        model.addAttribute("filmList", filmService.getAll());
        return "Home/home.jsp";
    }
}
