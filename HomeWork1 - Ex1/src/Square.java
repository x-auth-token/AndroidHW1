
public class Square extends Polygon {

	public Square(double sideLength) {
		super(sideLength);

	}

	@Override
	public int numberOfSides() {
		return 4;
	}

	@Override
	public double area() {
		
		return (Math.pow(getSideLength(), 2.0));
	}
	
	
	
}
