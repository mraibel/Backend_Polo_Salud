package sdp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sdp.api.model.UserRol;

public interface UserRolRepository extends JpaRepository<UserRol, Integer> {
    
}
