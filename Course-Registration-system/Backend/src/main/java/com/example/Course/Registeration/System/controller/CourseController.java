package com.example.Course.Registeration.System.controller;

import com.example.Course.Registeration.System.model.Course;
import com.example.Course.Registeration.System.model.CourseRegistry;
import com.example.Course.Registeration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<Course> availableCourses(){
        return courseService.availableCourses();
    }

    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseService.enrolledStudents();
    }

    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam("name") String name,
                               @RequestParam("emailId") String emailId,
                               @RequestParam("courseName") String courseName){

        courseService.enrolledCourses(name,emailId,courseName);
        return "Congratulations! "+name+" Enrollment Successful for "+courseName;
    }
}
