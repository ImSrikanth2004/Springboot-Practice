package com.spring1.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacManGame implements GamingConsole{
	public void up() {
		System.out.println("Up!");
	}
	public void down() {
		System.out.println("Down!");
	}
	public void left() {
		System.out.println("Back!");
	}
	public void right() {
		System.out.println("Forward!");
	}
	
}
