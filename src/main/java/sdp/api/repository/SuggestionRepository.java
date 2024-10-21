package sdp.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import sdp.api.model.Suggestion;

public interface SuggestionRepository extends JpaRepository<Suggestion, Integer>{
    
}