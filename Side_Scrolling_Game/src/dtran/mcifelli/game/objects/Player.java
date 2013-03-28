package dtran.mcifelli.game.objects;

/**
 * Object class for player(s)
 * @author dtran2
 *
 */
public class Player {
	private Weapon wep;		//Current equipped weapon
	private Utility util;	//Current equipped utility
	private int health;		//Health of the player
	private int energy;		//amount of energy player contains
	private int speed;		//Speed the player can move at
	private int powerUp;	//value of power up gauge
	private Position pos;	//player's position
	private Inventory inventory;
	//Initialize Player values
	public Player(int initX, int initY){
		this.pos = new Position(initX, initY);
		this.inventory = new Inventory();
		this.wep = Weapon.blade;
		this.util = Utility.solarPanel;
		this.inventory.addWeapon(this.wep);
		this.inventory.addUtility(this.util);
		this.health = 100;
		this.energy = 100;
		this.speed = 10;
		this.powerUp = 0;
		
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
		return this.wep;
	}
	//Returns equipped utility
	public Utility getUtility(){
		return this.util;
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
	/**
	 * Methods for changing player values
	 * position, weapon, utility, health, energy, speed, power up
	 */
	
	//Change player position
	public void movePlayer(int newX, int newY){
		this.pos.move(newX, newY);
	}
	//Switch weapons
	public void changeWeapon(Weapon newWep){
		this.wep = newWep;
	}
	//Switch utilities
	public void changeUtility(Utility newUtil){
		this.util = newUtil;
	}
	//update health
	public void changeHealth(int newHealth){
		this.health = newHealth;
	}
	//update energy
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
