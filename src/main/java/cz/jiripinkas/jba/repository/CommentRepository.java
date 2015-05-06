package cz.jiripinkas.jba.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import cz.jiripinkas.jba.entity.Comment;
import cz.jiripinkas.jba.entity.Course;
import cz.jiripinkas.jba.entity.User;

public interface CommentRepository extends JpaRepository<Comment, Integer>{

	List<Comment> findByCourse(Course course);
}
