package sdp.api.rest;
import sdp.api.model.SuggestionDTO;
import sdp.api.service.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "suggestions", produces = "application/json")
public class SuggestionRestController{
    @Autowired
    private SuggestionService suggestionService;

    @GetMapping(value = "", produces = "application/json")
    public ResponseEntity<List<SuggestionDTO>> getAllSuggestions() {
        List<SuggestionDTO> suggestionDTOList = suggestionService.findSuggestions();
        if (!suggestionDTOList.isEmpty()) {
            return new ResponseEntity<>(suggestionDTOList, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/{suggestionId}")
    public ResponseEntity<SuggestionDTO> getSuggestion(@PathVariable Integer suggestionId) {
        SuggestionDTO suggestionDTO = suggestionService.findSuggestion(suggestionId);
        if (suggestionDTO != null) {
            return new ResponseEntity<>(suggestionDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}