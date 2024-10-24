package sdp.api.model;

import java.util.List;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseMapper {
    CourseDTO courseToCourseDTO(Course course);
    public abstract List<CourseDTO> courseListToCourseDTOList(List<Course> courseList);
}
