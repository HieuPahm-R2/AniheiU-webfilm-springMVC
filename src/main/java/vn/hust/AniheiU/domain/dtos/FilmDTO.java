package vn.hust.AniheiU.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

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
    private Timestamp uploadDate;
}
