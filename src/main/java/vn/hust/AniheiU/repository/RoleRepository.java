package vn.hust.AniheiU.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.hust.AniheiU.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
    
}
