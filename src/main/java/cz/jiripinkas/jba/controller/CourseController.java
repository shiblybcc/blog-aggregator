//package cz.jiripinkas.jba.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import cz.jiripinkas.jba.service.CourseService;
//
//@Controller
//public class CourseController {
//
//	@Autowired
//	private CourseService courseService;
//	
//	@RequestMapping("/index")
//	public String courses(Model model){
//		model.addAttribute("courses", courseService.findAll());
//		return "index";
//	}
//}
