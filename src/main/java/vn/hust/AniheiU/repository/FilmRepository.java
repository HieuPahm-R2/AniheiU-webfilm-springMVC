package vn.hust.AniheiU.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.hust.AniheiU.domain.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {

}
