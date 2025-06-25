package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class courseController {
    @Autowired
    courseService courseService;

    @GetMapping("courses")
    public List<Course> avilableCourses(){
         return courseService.avilableCourses();
    }

    @GetMapping("courses/enrolled")
    public List<CourseRegistry> getEnrolledStu(){
        return courseService.getEnrolledStu();
    }
    @PostMapping("courses/register")
    public String enrollCourse(@RequestParam("name") String name ,
                               @RequestParam("emailId") String emailId,
                               @RequestParam("courseName") String courseName){
         courseService.enrollCourse(name, emailId, courseName);
         return " Congratulations "+name+ "  Enrolled Successfully For " +courseName;
    }
}
