package sdp.api.service;

import sdp.api.model.*;
import sdp.api.repository.PollRepository;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PollService {
    @Autowired
    private PollRepository pollRepository;
    private final PollMapper mapper = Mappers.getMapper(PollMapper.class);
    
    public List<PollDTO> findPolls() {
        List<Poll> pollList = pollRepository.findAll();
        List<PollDTO> pollDTOList;
        pollDTOList = mapper.pollListToPollDTOList(pollList);
        return pollDTOList;
    }
}
