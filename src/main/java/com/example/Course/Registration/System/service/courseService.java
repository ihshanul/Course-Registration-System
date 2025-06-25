package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.Repository.CourseRegistryRepo;
import com.example.Course.Registration.System.Repository.courseRepo;
import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class courseService {
    @Autowired
    courseRepo courseRepo;
    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Course> avilableCourses() {
        return courseRepo.findAll();
    }

    public List<CourseRegistry> getEnrolledStu() {
        return courseRegistryRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(name, emailId, courseName);
        courseRegistryRepo.save(courseRegistry);
    }
}
