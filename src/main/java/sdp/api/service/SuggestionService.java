package sdp.api.service;

import sdp.api.model.Suggestion;
import sdp.api.model.SuggestionDTO;

import sdp.api.repository.SuggestionRepository;

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

    public void createSuggestion(SuggestionDTO suggestionDTO) {
        Suggestion suggestion = mapper.suggestionDTOToSuggestion(suggestionDTO);
        suggestionRepository.save(suggestion);
    }

    public void deleteSuggestion(Integer suggestionId) {
        Suggestion suggestion = suggestionRepository.findById(suggestionId).orElseThrow(() -> new RuntimeException("Suggestion not found with id " + suggestionId));
        suggestionRepository.delete(suggestion);
    }
}