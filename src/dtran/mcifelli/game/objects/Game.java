package dtran.mcifelli.game.objects;

import dtran.mcifelli.game.map.Terrain;

public class Game {
	// FINALS
	private final int HEIGHT = 50;
	private final int WIDTH = 50;
	
	// FIELDS
	private Terrain[][] map = new Terrain[HEIGHT][WIDTH];
	
	// CONSTRUCTOR
	public Game() {
		
		
		
		
		
		
		
		
		
	}

	public Terrain[][] getMap() {
		return map;
	}
	public void setMap(Terrain[][] map) {
		this.map = map;
	}
}
