package sdp.api.model;

import java.util.List;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PollMapper {
    PollDTO pollToPollDto(Poll poll);

    public abstract List<PollDTO> pollListToPollDTOList(List<Poll> pollList);
}
