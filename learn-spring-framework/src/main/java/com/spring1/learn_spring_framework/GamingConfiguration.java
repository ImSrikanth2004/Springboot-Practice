package com.spring1.learn_spring_framework;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring1.learn_spring_framework.game.GameRunner;
import com.spring1.learn_spring_framework.game.GamingConsole;
import com.spring1.learn_spring_framework.game.PacManGame;
import com.spring1.learn_spring_framework.game.SuperContraGame;

@Configuration
public class GamingConfiguration {
	
		
		@Bean
		public GamingConsole game() {
			var game = new PacManGame();
			return game;
		}
		
		@Bean
		public GameRunner gameRunner(GamingConsole game) {
			var gameRunner = new GameRunner(game);
			return gameRunner;
		}
//		var game = new MarioGame();

//		var game = new SuperContraGame();
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();

}
