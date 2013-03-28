package dtran.mcifelli.game.objects;

public abstract class Item {
	private int durability;
	private int quantity;
	private String name;
	
	public Item() {
		setDurability(0);
		setQuantity(1);
		setName("Unknown");
	}

	/**
	 * @return the durability
	 */
	public int getDurability() {
		return durability;
	}
	/**
	 * @param durability the durability to set
	 */
	public void setDurability(int durability) {
		this.durability = durability;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
