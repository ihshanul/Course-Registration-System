package com.example.Course.Registration.System.Repository;

import com.example.Course.Registration.System.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseRepo  extends JpaRepository<Course, String> {
}
