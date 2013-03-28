package dtran.mcifelli.game.objects;

import java.util.ArrayList;

/**
 * Object class for the player inventory
 * Keeps track of what weapons utilities the 
 * player currently has as well as their current 
 * amount of currency(scrap).
 * @author dtran2
 *
 */
public class Inventory {
	private ArrayList<Weapon> currentWeapons;
	private ArrayList<Utility> currentUtilities;
	int scrap;
	public Inventory(){
		scrap = 0;
		this.currentWeapons = new ArrayList<Weapon>();
		this.currentUtilities = new ArrayList<Utility>();
	}
	
	/**
	 * Methods for returning values
	 * 
	 */
	public ArrayList<Weapon> getCurrentWeapons(){
		return this.currentWeapons;
	}
	public ArrayList<Utility> getCurrentUtilities(){
		return this.currentUtilities;
	}
	public int getScrap(){
		return this.scrap;
	}
	/**
	 * Methods for changing inventory values
	 *
	 */
	public void addWeapon(Weapon wep){
		this.currentWeapons.add(wep);
	}
	public void addUtility(Utility util){
		this.currentUtilities.add(util);
	}
	public void removeWeapon(Weapon wep){
		this.currentWeapons.remove(wep);
	}
	public void removeUtility(Utility util){
		this.currentUtilities.remove(util);
	}
}
