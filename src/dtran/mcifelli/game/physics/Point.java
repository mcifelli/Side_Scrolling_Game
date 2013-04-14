package dtran.mcifelli.game.physics;
/**
 * Point class used to define an object's position
 * @author dtran2 and mcifelli
 */
public class Point {
	// FIELDS
	private double x;
	private double y;
	
	// CONSTRUCTOR
	public Point () {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public Point(Point copy) {
		this.x = copy.x;
		this.y = copy.y;
	}
	
	// GETTERS & SETTERS
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	public double x(){
		return this.x;
	}
	public double y(){
		return this.y;
	}
	public void move(double x, double y){
		this.x = x;
		this.y = y;
	}
	public void add(double x, double y) {
		this.x += x;
		this.y += y;
	}
}
