package dtran.mcifelli.game.map;

public enum Terrain {
	water, 
	dirt,
	grass,
	air,
	dark;
	
	
	public int getColor() {
		switch (this) {
			case water:
				return 0;//blue
			case dirt:
				return 1;//brown
			case grass:
				return 2;//green
			case air:
				return 3;//light blue
			case dark:
				return 4; //black
			default:
				return 10;//make pink for debugging purposing

		}
	}
	
	public double getOpacity() {
		switch (this) {
			case water:
				return 0.5; // halve all light
			case dirt:
				return 0; 	// block all light
			case grass:
				return 0;	// block all light
			case air:
				return 1; 	// allow all light
			case dark:
				return 4; 	// block all light
			default:
				return 1;	// allow all light

		}
	}
	
	public String toString() {
		switch (this) {
		case water:
			return "W";
		case dirt:
			return "D";
		case grass:
			return "G";
		case air:
			return " ";
		case dark:
			return "/";
		default:
			return "";
		}
	}
}
