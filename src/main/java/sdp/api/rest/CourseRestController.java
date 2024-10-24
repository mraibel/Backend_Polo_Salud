package sdp.api.rest;
import sdp.api.model.CourseDTO;
import sdp.api.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "courses", produces = "application/json")
public class CourseRestController {
    @Autowired
    private CourseService courseService;

    @GetMapping(value = "", produces = "application/json")
    public ResponseEntity<List<CourseDTO>> getAllCourses() {
        List<CourseDTO> courseDTOList = courseService.findCourses();
        if (!courseDTOList.isEmpty()) {
            return new ResponseEntity<>(courseDTOList, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/{courseId}")
    public ResponseEntity<CourseDTO> getCourse(@PathVariable Integer courseId) {
        CourseDTO courseDTO = courseService.findCourseById(courseId);
        if (courseDTO != null) {
            return new ResponseEntity<>(courseDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
