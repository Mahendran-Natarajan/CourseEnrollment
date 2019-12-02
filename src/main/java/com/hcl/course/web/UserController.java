package com.hcl.course.web;

import com.hcl.course.entity.User;
import com.hcl.course.service.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/user")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/get")
    public ResponseEntity<?> getUsersList() {
        List<User> usersList = this.userRepository.findAll();
        System.out.println("getUsersList = " + usersList);
        return new ResponseEntity<>(usersList, HttpStatus.OK);
    }

    @GetMapping("/get/{userName}")
    public ResponseEntity<?> getUserByName(@PathVariable String userByName) {
        User user = this.userRepository.findByUserName(userByName);
        System.out.println("getUserByName  = " + user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

   /* @RequestMapping(value = "/add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addUsers(@RequestBody User user) {
        this.userRepository.save(user);
        System.out.println("User Details are Added Successfully" + user);
        return new ResponseEntity<>("User Details are Added Successfully", HttpStatus.OK);
    }*/
}
