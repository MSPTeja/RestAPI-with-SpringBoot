package com.Springrest.Springrest.Dao;

import com.Springrest.Springrest.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long>
{

}
