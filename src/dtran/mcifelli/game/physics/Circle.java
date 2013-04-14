package dtran.mcifelli.game.physics;
/**
 * Circle class used to define an object's area
 * @author mcifelli
 *
 */
public class Circle {
	// FIELDS
	private Point center;
	private double radius;
	
	// CONSTRUCTORS
	public Circle() {
		center = new Point();
		radius = 0;
	}
	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	public Circle(double x, double y, double radius) {
		this.center = new Point(x, y);
		this.radius = radius;
	}
	public Circle(Circle copy) {
		this.center = new Point(copy.center);
		this.radius = copy.radius;
	}
	
	// GETTERS & SETTERS
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = new Point(center);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
