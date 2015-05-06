package cz.jiripinkas.jba.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import cz.jiripinkas.jba.entity.Comment;
import cz.jiripinkas.jba.entity.Course;
import cz.jiripinkas.jba.repository.CommentRepository;
import cz.jiripinkas.jba.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired 
	private CommentRepository commentRepository;
	
	public List<Course> findAll(){
		return courseRepository.findAll();
	}

	public Course findOne(int id) {
		return courseRepository.findOne(id);
	}

	@Transactional
	public Course findOneWithCourse(int id) {
		Course course = findOne(id);
		List<Comment> comments = commentRepository.findByCourse(course);		
		course.setComments(comments);
		return course;
	}
}
