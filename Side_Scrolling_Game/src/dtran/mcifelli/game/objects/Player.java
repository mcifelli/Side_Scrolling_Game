package dtran.mcifelli.game.objects;

/**
 * Object class for player(s)
 * @author dtran2
 *
 */
public class Player {
	Weapon wep;		//Current equipped weapon
	Utility util;	//Current equipped utility
	int health;		//Health of the player
	int energy;		//amount of energy player contains
	int speed;		//Speed the player can move at
	int powerUp;	//value of power up gauge
	Position pos;	//player's position
	//Initialize Player values
	public Player(int initX, int initY){
		pos = new Position(initX, initY);	
		this.wep = Weapon.blade;
		this.util = Utility.solarPanel;
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
