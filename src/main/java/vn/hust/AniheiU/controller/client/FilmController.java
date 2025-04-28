package vn.hust.AniheiU.controller.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.hust.AniheiU.service.InFilmService;

@Controller
@RequestMapping("/film")
public class FilmController {
    @Autowired InFilmService filmService;

    @GetMapping("/{id}")
    public String getMovieDetail(Model model,@PathVariable("id") long id){
        model.addAttribute("film", filmService.getById(id));
        return "/FilmDetails/TVShow.jsp";
    }

}
