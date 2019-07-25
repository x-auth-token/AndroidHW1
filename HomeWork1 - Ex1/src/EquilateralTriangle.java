/**
 * This class represents equilateral triangle 
 * 
 * @author Pavel Mayzenberg
 * @version 1.0
 */

public class EquilateralTriangle extends Polygon {
	
	// Use the constructor from parent class
	public EquilateralTriangle(double sideLength) {
		super(sideLength);	
	}

	@Override
	public int numberOfSides() {
		return 3;
	}
	

	@Override
	public double area() {
		return (Math.sqrt(3)/4) * Math.pow(getSideLength(), 2.0);
	}
	
	
}
