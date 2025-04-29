package vn.hust.AniheiU.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.hust.AniheiU.service.InFilmService;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private InFilmService filmService;
    @GetMapping("/admin-home")
    public String getAdminPage(Model model){
        model.addAttribute("film", filmService.getAll());
        return "admin/index.jsp";
    }
}
