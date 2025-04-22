package vn.hust.AniheiU.service.implement;

import java.util.List;
import java.util.NoSuchElementException;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import vn.hust.AniheiU.domain.Category;
import vn.hust.AniheiU.domain.dtos.CategoryDTO;
import vn.hust.AniheiU.repository.CategoryRepository;
import vn.hust.AniheiU.service.InCategoryService;

@Service
public class CategoryService implements InCategoryService {
    private CategoryRepository categoryRepository;
    private ModelMapper modelMapper;

    public CategoryService(CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<CategoryDTO> getAll() {
        return categoryRepository.findAll().stream().map(item -> modelMapper.map(item, CategoryDTO.class)).toList();
    }

    @Override
    public CategoryDTO getById(Long id) {

        return modelMapper.map(categoryRepository.findById(id).orElseThrow(
                () -> new NoSuchElementException("Not Found")), CategoryDTO.class);
    }

    @Override
    public void update(CategoryDTO dto) {
        categoryRepository.save(modelMapper.map(dto, Category.class));
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public CategoryDTO insertForSave(CategoryDTO dto) {
        return modelMapper.map(
                categoryRepository.save(modelMapper.map(dto, Category.class)), CategoryDTO.class);
    }
}
