package vn.hust.AniheiU.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "nvarchar(150)")
    private String seasonName;

    @ManyToOne
    private Film films;
    @OneToMany(mappedBy = "season")
    private List<Episode> episodes;
}
