package vn.hust.AniheiU.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@Data
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "nvarchar(150)")
    private String seasonName;

    @ManyToOne
    private Film film;
    @OneToMany(mappedBy = "season")
    private List<Episode> episodes;
}
