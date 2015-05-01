package cz.jiripinkas.jba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
