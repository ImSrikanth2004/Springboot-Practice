package com.spring.jpa_hibernate.learn_jpa_hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.jpa_hibernate.learn_jpa_hibernate.course.Course;
import com.spring.jpa_hibernate.learn_jpa_hibernate.course.jpa.CourseJpaRepository;
import com.spring.jpa_hibernate.learn_jpa_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired 
	private CourseSpringDataJpaRepository repository;
	
  @Override
  public void run(String... args) throws Exception {
	  repository.save(new Course(1, "Learn AWS", "Stephane Marek"));
	  repository.save(new Course(2, "Learn DevOps", "in28minutes"));
	  repository.save(new Course(3, "Learn ReactJS", "JavaScript Mastery"));
	  repository.deleteById(1l);
	  System.out.println(repository.findById(2l)); 
	  System.out.println(repository.findById(3l));
	  System.out.println(repository.findByAuthor("JavaScript Mastery"));
	  System.out.println(repository.findByName("ReactJS"));
	  System.out.println(repository.count());
  } 
}
