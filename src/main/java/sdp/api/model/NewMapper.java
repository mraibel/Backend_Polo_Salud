package sdp.api.model;

import java.util.List;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NewMapper {
    NewDTO newToNewDTO(New news);

    New newDTOToNew(NewDTO newDTO);

    public abstract List<NewDTO> newListToNewDTOList(List<New> entidadList);
}
