package com.accenture.SpringbootGradle.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.SpringbootGradle.model.Alien;

@Controller
public class HomeController {
	@RequestMapping("/home")
	//@ResponseBody
	public ModelAndView home(Alien alien) {
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",alien);
		System.out.println(alien);
		mv.setViewName("home.jsp");
		return mv;
	}
}
