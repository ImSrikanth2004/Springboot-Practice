package com.spring1.learn_spring_framework.ex.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring1.learn_spring_framework.game.GameRunner;


public class XMLConfigurationContextLauncher {
	public static void main(String[] args) {
		try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
			Arrays.stream(context.getBeanDefinitionNames())
				  .forEach(System.out::println);;
				  System.out.println(context.getBean("name"));
				  System.out.println(context.getBean("age"));
				  context.getBean(GameRunner.class).run();
		}
}
}

