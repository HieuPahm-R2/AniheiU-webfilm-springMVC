package vn.hust.AniheiU.controller.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.hust.AniheiU.domain.dtos.CategoryDTO;
import vn.hust.AniheiU.domain.dtos.FilmDTO;
import vn.hust.AniheiU.service.InFilmService;
import vn.hust.AniheiU.service.implement.CategoryService;
import vn.hust.AniheiU.service.implement.FilmService;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryDetailsController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private InFilmService filmService;
    @GetMapping("/{id}")
    public String getCategory(@PathVariable long id, Model model) {
        CategoryDTO categoryDTO = categoryService.getById(id);
        model.addAttribute("category", categoryDTO);
        List<FilmDTO> films = filmService.getAllByCategoryId(id);
        model.addAttribute("films", films);
        return "CategoryDetails/CategoryDetail.jsp";
    }
}
