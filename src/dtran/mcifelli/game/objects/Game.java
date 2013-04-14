package dtran.mcifelli.game.objects;

import java.util.ArrayList;

import dtran.mcifelli.game.map.Terrain;

public class Game {
	// FINALS
	private final int HEIGHT = 10;
	private final int WIDTH = 50;
	
	// FIELDS
	private Terrain[][] map = new Terrain[HEIGHT][WIDTH];
	private Player player;
	
	// CONSTRUCTOR
	public Game() {
		setPlayer(new Player());
		initMap();
		initInventory();
	}

	// METHODS
	public boolean setTerrainAtLocation(int row, int col, Terrain terrain) {
		if ((0 <= row && row < HEIGHT) && (0 <= col && col < WIDTH)) {
			map[row][col] = terrain;
			return true;
		}
		return false;
	}
	
	private void initMap() {
		// this method will generate an initial map for the game
		// right now this function will generate a stock level, but ultimately should be defined values in a level file
		
		// fill level with air
		for (int row = 0; row < getHeight(); row ++) {
			for (int col = 0; col < getWidth(); col++) {
				setTerrainAtLocation(row, col, Terrain.air);
			}
		}
		
		// make floor
		for (int col = 0; col < getWidth(); col++) {
			setTerrainAtLocation(getHeight()-1, col, Terrain.dirt);
		}
	}
	
	
	/**
	 * fills the inventory with breakfast food, because everyone loves breakfast
	 * this will be replaced with a save file defining a players last inventory
	 */
	private void initInventory() {
		player.addToInventory(new Item("eggs"));
		player.addToInventory(new Item("bacon"));
		player.addToInventory(new Item("cereal"));
		player.addToInventory(new Item("orange juice"));
		player.addToInventory(new Item("milk"));
		player.addToInventory(new Item("oatmeal"));
		player.addToInventory(new Item("french toast"));
		player.addToInventory(new Item("pancakes"));
		player.addToInventory(new Item("butter"));
		player.addToInventory(new Item("sausage"));
		player.addToInventory(new Item("more bacon"));
		player.addToInventory(new Item("more eggs"));
		player.addToInventory(new Item("more sausage"));
		player.addToInventory(new Item("more bacon"));
		player.addToInventory(new Item("laser gun"));
		player.addToInventory(new Item("grappling hook"));
		player.addToInventory(new Item("gravity boots"));
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
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
}
