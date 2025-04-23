package vn.hust.AniheiU.domain;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int releaseYear;
    @Column(columnDefinition = "nvarchar(150)")
    private String name;
    @Column(columnDefinition = "nvarchar(4000)")
    private String thumbnail;
    @Column(columnDefinition = "nvarchar(800)")
    private String description;

    private Timestamp uploadDate;
    private boolean status;
    private boolean type;

    @ManyToMany
    private List<Category> categories;
    @OneToMany(mappedBy = "films")
    private List<Season> seasons;
    @ManyToMany
    private List<Tag> tags;
    @ManyToOne
    private Country countries;

}
