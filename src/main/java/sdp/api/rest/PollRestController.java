package sdp.api.rest;

import sdp.api.model.PollDTO;
import sdp.api.service.PollService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "polls", produces = "aplication/json")
public class PollRestController {
    @Autowired
    private PollService pollService;

    @GetMapping(value = "", produces = "application/json")
    public ResponseEntity<List<PollDTO>> getAllPolls() {
        List<PollDTO> pollDTOList = pollService.findPolls();
        if (!pollDTOList.isEmpty()){
            return new ResponseEntity<>(pollDTOList, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
