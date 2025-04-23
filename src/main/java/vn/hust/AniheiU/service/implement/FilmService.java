package vn.hust.AniheiU.service.implement;

import java.util.List;
import java.util.NoSuchElementException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.hust.AniheiU.domain.Film;
import vn.hust.AniheiU.domain.dtos.FilmDTO;
import vn.hust.AniheiU.repository.CategoryRepository;
import vn.hust.AniheiU.repository.FilmRepository;
import vn.hust.AniheiU.service.InCategoryService;
import vn.hust.AniheiU.service.InFilmService;

@Service
public class FilmService implements InFilmService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private FilmRepository repository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<FilmDTO> getAll() {
        return repository.findAll().stream().map(item -> modelMapper.map(item, FilmDTO.class)).toList();
    }

    @Override
    public FilmDTO getById(Long id) {
        return modelMapper.map(repository.findById(id).orElseThrow(
                () -> new NoSuchElementException("Not Found any thing..")), FilmDTO.class);
    }

    @Override
    public void update(FilmDTO dto) {
        repository.save(modelMapper.map(dto, Film.class));
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public FilmDTO insertForSave(FilmDTO dto) {
        return modelMapper.map(repository.save(modelMapper.map(dto, Film.class)), FilmDTO.class);
    }

    @Override
    public List<FilmDTO> getAllByCategoryId(long id) {
        return categoryRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Not found anything.."))
                .getFilmList().stream().map(item -> modelMapper.map(item, FilmDTO.class)).toList();
    }
}
