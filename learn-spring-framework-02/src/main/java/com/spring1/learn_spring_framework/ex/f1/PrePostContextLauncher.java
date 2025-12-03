package com.spring1.learn_spring_framework.ex.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDependency someDependency;
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All Dependencies Are Ready!");
	}
	@PostConstruct
	public void initialize() {
		SomeDependency.getReady();
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Cleaning everything up like connections or anything else before closing the application");  
	}
}

@Component
class SomeDependency{

	public static void getReady(){
		System.out.println("Some Action Related to be perfomed by SomeDependency");
	}

}

@Configuration
@ComponentScan
public class PrePostContextLauncher {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(PrePostContextLauncher.class)){
			Arrays.stream(context.getBeanDefinitionNames())
				  .forEach(System.out::println);;
		}
}
}

