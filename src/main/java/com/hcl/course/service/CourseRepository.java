package com.hcl.course.service;

import com.hcl.course.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository  extends JpaRepository<Courses, Long> {
    Courses findByCourseName(String courseName);
    Courses findByCourseCategory(String courseCategory);
}
