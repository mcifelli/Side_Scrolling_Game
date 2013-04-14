package dtran.mcifelli.game.client;

import dtran.mcifelli.game.objects.Game;

public class GameViewAlpha {
	private Game model;
	
	public static void main(String[] args) {
		model = new Game();
		buildMap();
		displayMap();
		
		
	}
	
	private static void displayMap() {
		for (int row = 0; row < model.getHeight(); row ++) {
			for (int col = 0; col < model.getWidth(); col++) {
				
				
			}
		}
	}

	private static void buildMap() {
		
	}
	
}
