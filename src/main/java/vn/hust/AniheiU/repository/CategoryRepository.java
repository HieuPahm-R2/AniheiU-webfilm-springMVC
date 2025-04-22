package vn.hust.AniheiU.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.hust.AniheiU.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
