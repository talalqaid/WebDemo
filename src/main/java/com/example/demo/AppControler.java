package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class AppControler {

    @GetMapping("/")
    public String welecome1(){
        return "Welcome to WebApp in Azure";
    }
    @GetMapping("/welcome")
    public String welecome2(){
        return "Welcome to spring boot";
    }
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return Arrays.asList(new Course(1, "Mathematics1","Ahmed"),
                new Course(2, "Physics","Ameen"),
                new Course(3, "Computer Science","Ali"));

    }

}
