package vn.hust.AniheiU.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FilmDTO {
    private Long id;
    private String name;
    private String description;
    private String thumbnail;
    private Boolean status;
    private Boolean type;
    private int releaseYear;
    private Set<CategoryDTO> Categories;
    private Timestamp uploadDate;
}
