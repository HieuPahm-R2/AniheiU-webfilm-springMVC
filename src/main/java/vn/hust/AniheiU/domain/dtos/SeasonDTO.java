package vn.hust.AniheiU.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeasonDTO {
    private Long id;
    private String seasonName;
    private List<EpisodeDTO> episodes;
}
