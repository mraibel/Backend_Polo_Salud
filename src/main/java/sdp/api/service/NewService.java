package sdp.api.service;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sdp.api.model.New;
import sdp.api.model.NewDTO;
import sdp.api.model.NewMapper;
import sdp.api.repository.NewRepository;

@Service
public class NewService {
    @Autowired
    private NewRepository newRepository;
    private final NewMapper mapper = Mappers.getMapper(NewMapper.class);

    public List<NewDTO> findNews() {
        List<New> newList = newRepository.findAll();
        List<NewDTO> newDTOList;
        newDTOList = mapper.newListToNewDTOList(newList);
        return newDTOList;
    }

    public boolean saveNew(NewDTO newDto) {
        try {
            if(newDto != null) {
                if(newDto.getId_new() == null) {
                    New news = mapper.newDTOToNew(newDto);
                    newRepository.saveAndFlush(news);
                }
            }   
        } catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
