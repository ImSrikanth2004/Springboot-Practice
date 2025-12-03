package com.springboot.learn_spring_boot;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		
		return Arrays.asList(
				new Course(1, "Learn AWS", "in28minutes"),
				new Course(2, "Learn Spring", "in28minutes"),
				new Course(3, "Learn React", "JavaScriptMastery"),
				new Course(4, "Learn NodeJS", "JavaScriptMastery")
				);
		
	}
	
}

