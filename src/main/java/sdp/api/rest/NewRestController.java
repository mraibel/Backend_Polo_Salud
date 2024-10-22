package sdp.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import sdp.api.model.NewDTO;
import sdp.api.service.NewService;

@RestController
@RequestMapping(value = "news", produces = "application/json")
public class NewRestController {
    @Autowired
    private NewService newService;

    @GetMapping(value = "", produces = "application/json")
    public ResponseEntity<List<NewDTO>> getAllNews() {
        List<NewDTO> newDTOList = newService.findNews();
        if(!newDTOList.isEmpty()) {
            return new ResponseEntity<>(newDTOList, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "", produces = "application/json")
    public ResponseEntity<Void> createNew(@Validated @RequestBody NewDTO newDTO) {
        if(newService.saveNew(newDTO)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
