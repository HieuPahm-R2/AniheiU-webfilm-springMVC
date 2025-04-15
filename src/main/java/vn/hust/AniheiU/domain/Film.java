package vn.hust.AniheiU.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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
    @OneToMany(mappedBy = "film")
    private List<Season> seasons;

}
