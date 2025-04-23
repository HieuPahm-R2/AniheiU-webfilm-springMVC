package vn.hust.AniheiU.service;

import vn.hust.AniheiU.domain.dtos.FilmDTO;

import java.util.List;

public interface InFilmService extends  InCrudService<FilmDTO, Long>{
    List<FilmDTO> getAllByCategoryId(long id);
}
