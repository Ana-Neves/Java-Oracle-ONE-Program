package com.forumhub.servicos;

import com.forumhub.entidades.Course;
import com.forumhub.repositorios.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourse(Course course) {
        return (Course) courseRepository.save(course);
    }
}
