package sdp.api.service;

import sdp.api.model.*;
import sdp.api.repository.SuggestionRepository;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuggestionService { // Este servicio se encarga de manejar las sugerencias
    @Autowired
    private SuggestionRepository suggestionRepository;
    private final SuggestionMapper mapper = Mappers.getMapper(SuggestionMapper.class);


    public List<SuggestionDTO> findSuggestions() {
        List<Suggestion> suggestionList = suggestionRepository.findAll();
        List<SuggestionDTO> suggestionDTOList;
        suggestionDTOList = mapper.suggestionListToSuggestionDTOList(suggestionList);
        return suggestionDTOList;
    }

    public SuggestionDTO findSuggestionById(Integer suggestionId) {
        Suggestion suggestion = suggestionRepository.findById(suggestionId).orElseThrow(() -> new RuntimeException("Suggestion not found with id " + suggestionId));
        return mapper.suggestionToSuggestionDto(suggestion);
    }

    public void deleteSuggestion(Integer suggestionId) {
        Suggestion suggestion = suggestionRepository.findById(suggestionId).orElseThrow(() -> new RuntimeException("Suggestion not found with id " + suggestionId));
        suggestionRepository.delete(suggestion);
    }
}