package vn.hust.AniheiU.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import vn.hust.AniheiU.service.implement.FilmService;

@Controller
public class HomeController {
    private final FilmService filmService;
    public HomeController(FilmService filmService) {
        this.filmService = filmService;
    }
    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("filmList", filmService.getAll());
        return "web/pages/home/Home.jsp";
    }
}
