package com.Springrest.Springrest.Services;

import com.Springrest.Springrest.Dao.CourseDao;
import com.Springrest.Springrest.Entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements Courseservices{

//List<Course> list;
@Autowired
private CourseDao courseDao;
public CourseServiceImpl()
{
//    list = new ArrayList<>();
//    list.add(new Course(45,"java courses","Basics of java"));
//    list.add(new Course(46,"Spring Boot","Creating REST API"));

}
    @Override
    public List<Course> getCourses() {
//        return list;
        List<Course> li = courseDao.findAll();
         return li;
    }
    @Override
    public Course getCourses(long courseId)
    {
//        Course c =null;
//        for(Course course: list)
//        {
//             if(course.getId() == courseId)
//             {
//                 c = course;
//                 break;
//             }
//        }
       return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
//          list.add(course);
        return courseDao.save(course);
    }

    @Override
    public Course Updatecourse(Course course,int Id)
    {
//        course.forEach(e -> {
//               if(e.getId() == course.getId()) {
//                   e.setTitle(course.getTitle());
//                   e.setDescription(course.getDescription());
//   }});
//       courseDao.save(course);
//       return courseDao.save(course);
        Course existingProduct = courseDao.findById(Long.valueOf(Id)).get();
        existingProduct.setId(course.getId());
        existingProduct.setTitle(course.getTitle());
        existingProduct.setDescription(course.getDescription());
        return courseDao.save(existingProduct);
    }
}
