package com.spring1.learn_spring_framework;

import com.spring1.learn_spring_framework.game.GameRunner;
import com.spring1.learn_spring_framework.game.MarioGame;
import com.spring1.learn_spring_framework.game.PacManGame;
import com.spring1.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new PacManGame();
		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
