package cz.jiripinkas.jba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cz.jiripinkas.jba.service.CourseService;

@Controller
public class RatingController {
	
	@Autowired
	private CourseService courseService;

	@RequestMapping("/rating")
	public String rating(Model model) {
		model.addAttribute("course", courseService.findOne(1));
		return "rating";
	}	
	

}
