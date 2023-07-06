package com.Springrest.Springrest.Services;

import com.Springrest.Springrest.Entities.Course;

import java.util.List;

public interface Courseservices {
    public List<Course> getCourses();

    public Course getCourses(long courseId);

    public Course addCourse(Course course);
    public Course Updatecourse(Course course,int Id);



}
