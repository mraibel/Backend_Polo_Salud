package sdp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sdp.api.model.Poll;

public interface PollRepository extends JpaRepository<Poll, Integer> {
    
}
