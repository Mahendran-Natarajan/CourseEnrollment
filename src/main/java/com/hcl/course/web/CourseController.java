package com.hcl.course.web;

import com.hcl.course.entity.Courses;
import com.hcl.course.service.CourseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/course")
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

/*
    @RequestMapping("/get")
    public ResponseEntity<?> getCourseList() {
        List<Courses> courseList = this.courseRepository.findAll();
        return new ResponseEntity<>(courseList, HttpStatus.OK);
    }
*/

    @RequestMapping("/get/{courseName}")
    //by using principal we can get the user details
    public ResponseEntity<?> getCourseByName(@PathVariable String courseName) {
        Courses course = this.courseRepository.findByCourseName(courseName);
        System.out.println("CourseController.getCourseByName " + course );
        return new ResponseEntity<>(course, HttpStatus.OK);
    }
    @RequestMapping("/get/{courseCategory}")
    //by using principal we can get the user details
    public ResponseEntity<?> getCourseByCategory(@PathVariable String courseCategory) {
        Courses courseCat = this.courseRepository.findByCourseCategory(courseCategory);
        return new ResponseEntity<>(courseCat, HttpStatus.OK);
    }

   /* @RequestMapping(value = "/add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addCourse(@RequestBody Courses courses) {
        this.courseRepository.save(courses);
        System.out.println("Course details are Added Successfully" + courses);
        return new ResponseEntity<>("Course details are Added Successfully", HttpStatus.OK);
    }*/
}
