

public class EquilaterialTriangle extends Polygon {
	

	public EquilaterialTriangle(double sideLength) {
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
