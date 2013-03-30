package dtran.mcifelli.game.objects;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Object class for player(s)
 * @author dtran2
 *
 */
public class Player {
	private Weapon weapon;		//Current equipped weapon
	private Utility utility;	//Current equipped utility
	private int health;			//Health of the player
	private int energy;			//amount of energy player contains
	private int speed;			//Speed the player can move at
	private int powerUp;		//value of power up gauge
	private Position pos;		//player's position
	private ArrayList<Item> inventory;
	
	//Initialize Player values
	public Player(int initX, int initY){
		this.pos = new Position(initX, initY);
		inventory = new ArrayList<Item>();
		weapon = new Weapon(Weapons.blade);
		utility = new Utility(Utilities.solarPanel);
		health = 100;
		energy = 100;
		speed = 10;
		powerUp = 0;
	}
	
	/**
	 * Methods for fetching player values
	 */
	//Returns the position of the player
	public Position getPosition(){
		return this.pos;
	}
	//Returns equipped weapon
	public Weapon getWeapon(){
		return this.weapon;
	}
	//Returns equipped utility
	public Utility getUtility(){
		return this.utility;
	}
	//Returns current health;
	public int getHealth(){
		return this.health;
	}
	public int getEnergy(){
		return this.energy;
	}
	//Returns the movement speed of the player
	public int getSpeed(){
		return this.speed;
	}
	//Returns the value of power-up gauge
	public int getPowerUp(){
		return this.powerUp;
	}
	//Returns the player's Inventory
	public ArrayList<Item> getInventory(){
		return this.inventory;
	}
	
	/**
	 * Methods for changing player values
	 * position, weapon, utility, health, energy, speed, power up, and items in inventory
	 */
	//Change player position
	public void movePlayer(int newX, int newY){
		this.pos.move(newX, newY);
	}
	//Switch weapons
	public void changeWeapon(Weapon newWep){
		this.weapon = newWep;
	}
	//Switch utilities
	public void changeUtility(Utility newUtil){
		this.utility = newUtil;
	}
	//Update health
	public void changeHealth(int newHealth){
		this.health = newHealth;
	}
	//Update energy
	public void changeEnergy(int newEnergy){
		this.energy = newEnergy;
	}
	//Change the movement speed
	public void changeSpeed(int newSpeed){
		this.speed = newSpeed;
	}
	//Change value of power up gauge
	public void changePowerUp(int newPowerUp){
		this.powerUp = newPowerUp;
	}
}
