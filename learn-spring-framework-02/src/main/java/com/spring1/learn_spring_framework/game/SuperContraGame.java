package com.spring1.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
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
