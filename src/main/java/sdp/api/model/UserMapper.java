package sdp.api.model;

import java.util.List;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO userToUserDto(User user);

    public abstract List<UserDTO> empleadoListToEmpleadoDTOList(List<User> entidadList);
}
