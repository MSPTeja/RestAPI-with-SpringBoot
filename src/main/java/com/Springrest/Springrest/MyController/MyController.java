package com.Springrest.Springrest.MyController;

import com.Springrest.Springrest.Entities.Course;
import com.Springrest.Springrest.Services.Courseservices;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@RestController
public class MyController {
   @Autowired
    private Courseservices CourseServices;
    @GetMapping("/home")

    public String home()
    {
        return "this string";
    }
//get the courses return list of courses
    @GetMapping("/Courses")
    public List<Course> getcourses()
    {
  return this.CourseServices.getCourses();
    }
    @GetMapping("/Courses/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
        return this.CourseServices.getCourses(Long.parseLong(courseId));
    }
    @PostMapping("/Courses")
    public Course addcourse(@RequestBody Course course)
    {
        return this.CourseServices.addCourse(course);
    }
    @PutMapping("/Courses/{Id}")
    public Course Updatecourse(@RequestBody Course course, @PathVariable int Id)
    {
        return this.CourseServices.Updatecourse(course,Id);
    }
}
