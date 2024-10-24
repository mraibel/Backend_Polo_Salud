package sdp.api.service;

import sdp.api.model.*;
import sdp.api.repository.CourseRepository;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    private final CourseMapper mapper = Mappers.getMapper(CourseMapper.class);

    public List<CourseDTO> findCourses() {
        List<Course> courseList = courseRepository.findAll();
        List<CourseDTO> courseDTOList;
        courseDTOList = mapper.courseListToCourseDTOList(courseList);
        return courseDTOList;
    }

    public CourseDTO findCourseById(Integer courseId) {
        Course course = courseRepository.findById(courseId).orElseThrow(() -> new RuntimeException("Curso no encontrado con la id " + courseId));
        return mapper.courseToCourseDTO(course);
    }

    public void deleteCourse(Integer courseId) {
        Course course = courseRepository.findById(courseId).orElseThrow(() -> new RuntimeException("Curso no encontrado con la id  " + courseId));
        courseRepository.delete(course);
    }
}
