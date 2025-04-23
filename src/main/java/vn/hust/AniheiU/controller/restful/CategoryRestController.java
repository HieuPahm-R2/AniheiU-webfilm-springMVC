package vn.hust.AniheiU.controller.restful;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.hust.AniheiU.service.InCategoryService;

@RestController
@RequestMapping("api/ver1/category-api")
@CrossOrigin(origins = "*")
public class CategoryRestController {
    @Autowired
    private InCategoryService categoryService;
    @GetMapping("/get-all-categories")
    public ResponseEntity<?> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAll());
    }
}
