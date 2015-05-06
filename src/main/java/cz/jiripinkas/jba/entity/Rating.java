package cz.jiripinkas.jba.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Rating {

	@Id
	@GeneratedValue
	private Integer id;
	
	private Double first_cat;
	private Double second_cat;
	private Double third_cat;
	private Double fourth_cat;
	private Double fifth_cat;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getFirst_cat() {
		return first_cat;
	}
	public void setFirst_cat(Double first_cat) {
		this.first_cat = first_cat;
	}
	public Double getSecond_cat() {
		return second_cat;
	}
	public void setSecond_cat(Double second_cat) {
		this.second_cat = second_cat;
	}
	public Double getThird_cat() {
		return third_cat;
	}
	public void setThird_cat(Double third_cat) {
		this.third_cat = third_cat;
	}
	public Double getFourth_cat() {
		return fourth_cat;
	}
	public void setFourth_cat(Double fourth_cat) {
		this.fourth_cat = fourth_cat;
	}
	public Double getFifth_cat() {
		return fifth_cat;
	}
	public void setFifth_cat(Double fifth_cat) {
		this.fifth_cat = fifth_cat;
	}
	
}
