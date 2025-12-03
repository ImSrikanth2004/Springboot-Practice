package com.spring1.learn_spring_framework.game;

public class SuperContraGame implements GamingConsole{
	public void up() {
		System.out.println("Contra Jump!");
	}
	public void down() {
		System.out.println("Contra Sit Down!");
	}
	public void left() {
		System.out.println("Contra Back!");
	}
	public void right() {
		System.out.println("Contra Shoot!");
	}
	
}
