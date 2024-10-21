package sdp.api.model;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SuggestionMapper {
    SuggestionDTO suggestionToSuggestionDto(Suggestion suggestion);

    public abstract List<SuggestionDTO> suggestionListToSuggestionDTOList(List<Suggestion> suggestionList);
}