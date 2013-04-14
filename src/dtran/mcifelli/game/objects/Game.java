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
	
	// METHODS
	public boolean setTerrainAtLocation(int row, int col, Terrain terrain) {
		if ((0 <= row && row < HEIGHT) && (0 <= col && col < WIDTH)) {
			map[row][col] = terrain;
			return true;
		}
		return false;
	}
	
	
	
	// GETTERS & SETTERS
	public Terrain[][] getMap() {
		return map;
	}
	public void setMap(Terrain[][] map) {
		this.map = map;
	}
	public int getHeight() {
		return HEIGHT;
	}
	public int getWidth() {
		return 	WIDTH;
	}
}
