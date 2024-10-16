package sdp.api.rest;

import sdp.api.model.UserDTO;
import sdp.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "users", produces = "application/json")
public class UserRestController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "", produces = "application/json")
    public ResponseEntity<List<UserDTO>> getAllEmpleados() {
        List<UserDTO> userDTOList = userService.findEmpleados();
        if (!userDTOList.isEmpty()) {
            return new ResponseEntity<>(userDTOList, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
