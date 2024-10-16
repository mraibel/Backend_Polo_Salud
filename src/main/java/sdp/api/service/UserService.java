package sdp.api.service;

import sdp.api.model.*;
import sdp.api.repository.UserRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    private final UserMapper mapper = Mappers.getMapper(UserMapper.class);
    
    public List<UserDTO> findEmpleados() {
        List<User> userList = userRepository.findAll();
        List<UserDTO> userDTOList;
        userDTOList = mapper.empleadoListToEmpleadoDTOList(userList);
        return userDTOList;
    }
}
