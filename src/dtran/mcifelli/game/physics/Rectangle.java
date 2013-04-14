package dtran.mcifelli.game.physics;
/**
 * Rectangle class used to define an objects area
 * @author mcifelli
 *
 */
public class Rectangle {
	// FIELDS
	private Point topLeft;
	private Point size;
	
	// CONSTRUCTORS
	public Rectangle() {
		setTopLeft(new Point());
		setSize(new Point());
	}
	public Rectangle(Point topLeft, Point size) {
		setTopLeft(topLeft);
		setSize(size);
	}
	public Rectangle(double x, double y, double width, double height) {
		setTopLeft(new Point(x, y));
		setSize(new Point(width, height));
	}
	public Rectangle(Rectangle copy) {
		setTopLeft(new Point(copy.getTopLeft()));
		setSize(new Point(copy.getSize()));
	}

	// GETTERS & SETTERS
	public Point getSize() {
		return size;
	}
	public void setSize(Point size) {
		this.size = size;
	}
	public Point getTopLeft() {
		return topLeft;
	}
	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}
	public Point getTopRight() {
		return new Point(topLeft.x() + size.x(), topLeft.y());
	}
	public Point getBottomRight() {
		return new Point(topLeft.x() + size.x(), topLeft.y() + size.y());
	}
	public Point getBottomLeft() {
		return new Point(topLeft.x(), topLeft.y() + size.y());
	}
	public Point getCenter() {
		return new Point(topLeft.x() + (size.x()/2), topLeft.y() + (size.y()/2));
	}
}
