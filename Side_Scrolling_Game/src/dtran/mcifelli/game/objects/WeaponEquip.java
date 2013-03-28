package dtran.mcifelli.game.objects;
/**
 * Handles weapon attributes depending on the
 * weapon currently equipped 
 * @author dtran2
 *
 */
public class WeaponEquip {
	int damage, fireRate, range;
	
	public WeaponEquip(Weapon wep){
		//NOTE:These values were initialized for testing purposes; change these values later;
		if(wep.equals(Weapon.blade)){
			this.damage = 10;
			this.fireRate = 1;
			this.range = 5;
			
		}else if(wep.equals(Weapon.emp)){
			this.damage = 20;
			this.fireRate = 2;
			this.range = 20;
			
		}else if(wep.equals(Weapon.lazer)){
			this.damage = 20;
			this.fireRate = 3;
			this.range = 15;
			
		}else if(wep.equals(Weapon.lightningGun)){
			this.damage = 1;
			this.fireRate = 10;
			this.range = 10;
			
		}else if(wep.equals(Weapon.magnentBombs)){
			this.damage = 1;
			this.fireRate = 10;
			this.range = 10;
			
		}else if(wep.equals(Weapon.megaPunch)){
			this.damage = 1;
			this.fireRate = 10;
			this.range = 10;
			
		}else if(wep.equals(Weapon.scatterGun)){
			this.damage = 1;
			this.fireRate = 10;
			this.range = 10;
		}
				
	}
	/**
	 * Methods for getting object values
	 * 
	 */
	public int getDamage(){
		return this.damage;
	}
	public int getFireRate(){
		return this.fireRate;
	}
	public int getRange(){
		return this.range;
	}

}
