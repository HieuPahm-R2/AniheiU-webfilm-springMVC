package vn.hust.AniheiU.domain.dtos;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class SeasonDTO {
    private Long id;
    private String seasonName;
    private FilmDTO film;
}
