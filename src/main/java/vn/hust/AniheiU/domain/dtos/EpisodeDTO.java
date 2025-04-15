package vn.hust.AniheiU.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EpisodeDTO {
    private Integer ep;
    private Long id;
    private String linkFilm;
    private Boolean status;
    private Timestamp uploadDate;
    private SeasonDTO season;
}
