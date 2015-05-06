package cz.jiripinkas.jba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cz.jiripinkas.jba.service.CourseService;

@Controller
public class IndexController {

	@Autowired
	private CourseService courseService;

	@RequestMapping("/index")
	public String courses(Model model) {
		model.addAttribute("courses", courseService.findAll());
		return "index";
	}
	
//	@RequestMapping("courses/{id}")
//	public String detail(Model model, @PathVariable int id){
//		model.addAttribute("course", courseService.findOne(id));
//		return "course-detail";
//	}
	
	@RequestMapping("courses/{id}")
	public String detail(Model model, @PathVariable int id){
		model.addAttribute("course", courseService.findOneWithCourse(id));
		return "course-detail";
	}
	
	@RequestMapping("courses/{id}/rating")
	public String rating(Model model, @PathVariable int id){
		model.addAttribute("course", courseService.findOne(id));
		return "rating";
	}
	
	@RequestMapping("/signin")
	public String Signin(){
		return "signin";
	}
}
