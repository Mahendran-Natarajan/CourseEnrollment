package com.hcl.course.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String userName;

    @ManyToMany (mappedBy = "courseEnrollment")
    List<Courses> coursesList;

    public User(Long id, String userName, List<Courses> coursesList) {
        this.id = id;
        this.userName = userName;
        this.coursesList = coursesList;
    }

    public User(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Courses> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Courses> coursesList) {
        this.coursesList = coursesList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", coursesList=" + coursesList +
                '}';
    }
}
