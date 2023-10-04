package com.in28minutes.spring.learnspringframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	@Autowired
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		
		this.game = game;
	}

	public void run() {
		game.up();
		game.dawn();
		game.left();
		game.right();
		
	}

}
