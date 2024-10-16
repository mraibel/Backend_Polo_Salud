package sdp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sdp.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
} 
