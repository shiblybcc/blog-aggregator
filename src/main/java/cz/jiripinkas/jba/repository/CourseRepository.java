package cz.jiripinkas.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.jiripinkas.jba.entity.Course;
import cz.jiripinkas.jba.entity.User;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
