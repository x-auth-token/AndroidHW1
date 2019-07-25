/**
 * This class represents basic polygon
 * @author Pavel Mayzenberg
 * @version 1.0
 *
 */
public class Polygon {
	
	private double sideLength;

	public Polygon(double sideLength) {
		this.sideLength = sideLength;
	}
	
	/**
	 * 
	 * @return number of sides
	 */
	public int numberOfSides() {
		return 0;
	}
	
	/**
	 * 
	 * @return area of the figure
	 */
	public double area() {
		
		return 0;
	}
	
	/**
	 * 
	 * @return the length of each side
	 */
	public double getSideLength() {
		return this.sideLength;
	}
	
	/**
	 * Prints area calculation results 
	 */
	public String toString() {
		return "The area of " + this.getClass().getSimpleName() + " is: " + this.area();
	}

}
