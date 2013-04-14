package dtran.mcifelli.game.objects;

public class Item {
	// FIELDS
	private String name;
	
	// CONSTRUCTOR
	public Item() {
		setName("Unknown");
	}
	public Item(String name) {
		setName(name);
	}
	public Item(Item copy) {
		setName(copy.name);
	}
	
	// GETTERS && SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
