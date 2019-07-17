
public class RegularPentagon extends Polygon {
	RegularPentagon(double sideLength) {
		super(sideLength);
	}

	@Override
	public int numberOfSides() {
		return 5;
	}

	@Override
	public double area() {
		return 0.5 * (5 * getSideLength()) * (getSideLength()/(2 * Math.tan((Math.PI/5))));
	}
	
	
}
