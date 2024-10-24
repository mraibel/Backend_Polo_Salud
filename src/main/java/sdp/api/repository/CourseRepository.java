package sdp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sdp.api.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    
}
