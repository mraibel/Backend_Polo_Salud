package sdp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sdp.api.model.New;

public interface NewRepository extends JpaRepository<New, Integer> {

}
