package vn.hust.AniheiU.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeasonDTO {
    private Long id;
    private String seasonName;
    private FilmDTO film;
}
