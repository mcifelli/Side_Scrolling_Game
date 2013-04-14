package dtran.mcifelli.game.objects;

import dtran.mcifelli.game.physics.Point;
import dtran.mcifelli.game.physics.Rectangle;

/**
 * Object class for player(s)
 * @author dtran2 and mcifelli
 *
 */
public class Player {
	// FINALS
	private final int WIDTH = 1;
	private final int HEIGHT = 2;
	
	// FIELDS
	private Rectangle body;
	private Item inventory[] = new Item[16];	// player's current list of owned items
	
	// CONSTRUCTORS
	public Player() {
		setBody(new Rectangle());
	}
	public Player(Point topLeft){	
		setBody(new Rectangle(topLeft, new Point(WIDTH, HEIGHT)));
	}

	// METHODS
	public boolean addToInventory(Item item) {
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] == null) {
				inventory[i] = new Item(item);
				return true;
			}
		}
		return false;
	}
	public Rectangle getBody() {
		return body;
	}
	public void setBody(Rectangle body) {
		this.body = body;
	}
	public Item[] getInventory() {
		return inventory;
	}
	public void setInventory(Item[] inventory) {
		this.inventory = inventory;
	}
}
