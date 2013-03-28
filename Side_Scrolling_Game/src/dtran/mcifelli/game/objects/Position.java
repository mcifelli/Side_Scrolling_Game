package dtran.mcifelli.game.objects;
/**
 * Keeps track of objects' positions
 * @author dtran2
 *
 */
public class Position {
	int x;
	int y;
	public Position(int initX, int initY){
		this.x = initX;
		this.y = initY;
	}
	
	//Methods for getting x and y coordinates
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	//Methods for changing the x and y coordinates
	public void move(int newX, int newY){
		this.x = newX;
		this.y = newY;
	}


}
