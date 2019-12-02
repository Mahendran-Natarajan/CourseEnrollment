package com.hcl.course.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Courses implements Serializable {

    @Id
    @GeneratedValue
    private Long id;


    @Column
    private String courseName;

    @Column
    private String courseCategory;

    @ManyToMany
    List<User> courseEnrollment;

    public Courses(){
        super();
    }

    public Courses(Long id, String courseName, String courseCategory, List<User> courseEnrollment) {
        this.id = id;
        this.courseName = courseName;
        this.courseCategory = courseCategory;
        this.courseEnrollment = courseEnrollment;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", courseCategory='" + courseCategory + '\'' +
                ", courseEnrollment=" + courseEnrollment +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(String courseCategory) {
        this.courseCategory = courseCategory;
    }

    public List<User> getCourseEnrollment() {
        return courseEnrollment;
    }

    public void setCourseEnrollment(List<User> courseEnrollment) {
        this.courseEnrollment = courseEnrollment;
    }
}
