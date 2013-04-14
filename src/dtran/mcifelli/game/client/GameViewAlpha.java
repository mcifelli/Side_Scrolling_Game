package dtran.mcifelli.game.client;

import dtran.mcifelli.game.objects.Game;
import dtran.mcifelli.game.objects.Item;

public class GameViewAlpha {
	private static Game model;
	
	public static void main(String[] args) {
		model = new Game();
		displayMap();
		System.out.println("--------------------------------");
		displayItems();
	}
	
	private static void displayItems() {
		System.out.println("Inventory:");
		Item inventory[] = model.getPlayer().getInventory();
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null) {
				System.out.println(i+1 + ". " + inventory[i].getName());
			}
		}
	}

	private static void displayMap() {
		for (int row = 0; row < model.getHeight(); row ++) {
			for (int col = 0; col < model.getWidth(); col++) {
				System.out.print(model.getMap()[row][col].toString());
			}
			System.out.print("\n");
		}
	}
}
