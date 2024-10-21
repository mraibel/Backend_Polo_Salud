package sdp.api.service;

import sdp.api.model.*;
import sdp.api.repository.RolRepository;
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

    @Autowired
    private RolRepository rolRepository;
    
    public List<UserDTO> findEmpleados() {
        List<User> userList = userRepository.findAll();
        List<UserDTO> userDTOList;
        userDTOList = mapper.empleadoListToEmpleadoDTOList(userList);
        return userDTOList;
    }


    public void asignarRol(Integer userId, Integer rolId){
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User no encontrado con la id " + userId));
        Rol rol = rolRepository.findById(rolId).orElseThrow(() -> new RuntimeException("Rol no encontrado con la id " + rolId));
        user.addRol(rol);
        userRepository.save(user);
    }
}
