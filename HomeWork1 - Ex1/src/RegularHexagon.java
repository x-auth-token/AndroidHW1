
public class RegularHexagon extends Polygon{

	public RegularHexagon(double sideLength) {
		super(sideLength);
		
	}

	@Override
	public int numberOfSides() {
		return 6;
	}

	@Override
	public double area() {
		return ((3 * Math.sqrt(3))/ 2) * Math.pow(getSideLength(), 2.0);
	}
	
	
	
}
