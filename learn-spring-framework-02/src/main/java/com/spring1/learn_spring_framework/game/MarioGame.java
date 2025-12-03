package com.spring1.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{
	public void up() {
		System.out.println("Mario Jump!");
	}
	public void down() {
		System.out.println("Mario Duck!");
	}
	public void left() {
		System.out.println("Mario Back!");
	}
	public void right() {
		System.out.println("Mario Run!");
	}
	
}
