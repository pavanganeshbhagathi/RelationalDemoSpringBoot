package com.relation.relationship.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/course")
public class CourseController {

	@GetMapping(path="/hello")
	public String helloWorld()
	{
		return "hello controller working";
	}
	
	
	
	
}
