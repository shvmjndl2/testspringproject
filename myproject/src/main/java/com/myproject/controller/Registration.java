package com.myproject.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;



public class Registration {

	
	/*@Autowired
	private StudentService studentService;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public StudentService getStudentService() {
		return studentService;
	}*/
	
	@GetMapping("/home")
	public String homePage(Model theModel) {
		
		System.out.println("list customer success!!!");
		return "home";
	}
	
	@GetMapping("/register")
	public String registerPage(Model theModel) {
		theModel.addAttribute("student", new Student());
		theModel.addAttribute("studentCredential", new StudentCredential());

		System.out.println("registerPage success!!!");
		return "registrationtest";
	}
	//registrationtest
	//register
	
	@GetMapping("/login")
	public String loginPage(Model theModel){
		theModel.addAttribute("studentCredential", new StudentCredential());
		return "registrationtest";
	}
	
	@PostMapping("/registerSuccess")
	public ModelAndView registerSuccess(@Valid @ModelAttribute("student") Student student,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return new ModelAndView("registrationtest");
		}
		System.out.println("student===>"+ student);
	//dao	getStudentService().registerStudent(student);
		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("student", student);
		return modelAndView;
	}
	
	@PostMapping("/loginSuccess")
	public ModelAndView loginSuccess(@Valid @ModelAttribute("studentCredential") StudentCredential studentCredential,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return new ModelAndView("registrationtest");
		}
		ModelAndView modelAndView = new ModelAndView("welcome");
		Student student = getStudentService().validateStudentCredential(studentCredential.getEmail(), studentCredential.getPassword());
		System.out.println("studenttttt===>"+student);
		if(student!= null){
			System.out.println("inside if===>"+student);

			modelAndView.addObject("student", student);
			return modelAndView;
		}else{
			 modelAndView = new ModelAndView("notFound");
		}
		return modelAndView;
	}
	

	

}
