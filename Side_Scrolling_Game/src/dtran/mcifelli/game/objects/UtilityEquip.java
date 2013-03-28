package dtran.mcifelli.game.objects;
/**
 * Handles object values for the 
 * currently equipped utility
 */
public class UtilityEquip {
	int range, fireRate;
	public UtilityEquip(Utility util){
		//Object values initialized for testing purposes; change later
		if(util.equals(Utility.freezeRay)){
			this.range = 20;
			this.fireRate = 4;
		}else if(util.equals(Utility.grapplingHook)){
			this.range = 20;
			this.fireRate = 4;
		}else if(util.equals(Utility.gravityMod)){
			this.range = 20;
			this.fireRate = 4;
		}else if(util.equals(Utility.rocketBoosters)){
			this.range = 20;
			this.fireRate = 4;
		}else if(util.equals(Utility.solarPanel)){
			this.range = 20;
			this.fireRate = 4;
		}else if(util.equals(Utility.telekinesisGun)){
			this.range = 20;
			this.fireRate = 4;
		}
	}
	
	/**
	 * Methods or getting object values
	 */
	public int getRange(){
		return this.range;
	}
	public int getFireRate(){
		return this.fireRate;
	}
}
