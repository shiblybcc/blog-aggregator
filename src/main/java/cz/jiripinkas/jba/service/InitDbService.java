package cz.jiripinkas.jba.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.jiripinkas.jba.entity.Comment;
import cz.jiripinkas.jba.entity.Course;
import cz.jiripinkas.jba.entity.Rating;
import cz.jiripinkas.jba.entity.User;
import cz.jiripinkas.jba.repository.CommentRepository;
import cz.jiripinkas.jba.repository.CourseRepository;
import cz.jiripinkas.jba.repository.RatingRepository;
import cz.jiripinkas.jba.repository.UserRepository;

@Transactional
@Service
public class InitDbService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private RatingRepository ratingRepository;

	@Autowired
	private CommentRepository commentRepository;

	@PostConstruct
	public void init() {

		for (int i = 1; i < 15; i++) {

			Course course1 = new Course();
			course1.setName("Course Name" + i);
			course1.setDescription("This is the description or the content of the course. This info will be taken from l2p. This is the description or the content of the course. This is the description or the content of the course. This info will be taken from l2p. This is the description or the content of the course. This is the description or the content of the course. This info will be taken from l2p. This is the description or the content of the course. This is the description or the content of the course. This info will be taken from l2p. This is the description or the content of the course. This is the description or the content of the course. This info will be taken from l2p. This is the description or the content of the course. This is the description or the content of the course. This info will be taken from l2p. This is the description or the content of the course. This is the description or the content of the course. This info will be taken from l2p. This is the description or the content of the course. This is the description or the content of the course. This info will be taken from l2p. This is the description or the content of the course.");
			courseRepository.save(course1);

			User user = new User();
			user.setName("User Name" + i);
			List<Course> courses = new ArrayList<Course>();
			courses.add(course1);
			user.setCourses(courses);
			userRepository.save(user);

			Rating rating = new Rating();
			rating.setFirst_cat(4.5);
			rating.setSecond_cat(4.0);
			rating.setThird_cat(3.4);
			rating.setFourth_cat(4.4);
			rating.setFifth_cat(4.3);
			rating.setCourse(course1);
			rating.setUser(user);
			ratingRepository.save(rating);

			for (int j = 1; j < i + 3; j++) {
				Comment comment = new Comment();
				comment.setTitle("Comment title " + j);
				comment.setContent("This is the sample comment given by a user. This is the sample comment given by a user. This is the sample comment given by a user. This is the sample comment given by a user. This is the sample comment given by a user. ");
				comment.setCourse(course1);
				comment.setUser(user);
				commentRepository.save(comment);
			}

		}

	}

}
