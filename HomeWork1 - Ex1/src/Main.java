
public class Main {
	public static void main(String[] args) {
		double sideLength = 1;
		
		Polygon polygon = new Polygon(sideLength);
		EquilaterialTriangle eqTriangle = new EquilaterialTriangle(sideLength);
		Square square = new Square(sideLength);
		RegularPentagon rPentagon = new RegularPentagon(sideLength);
		RegularHexagon rHexagon	= new RegularHexagon(sideLength);
		
		Polygon polygonArr[] = {polygon, eqTriangle, square, rPentagon, rHexagon};
		
		for (int i = 0; i < polygonArr.length; i++) {
			System.out.println(polygonArr[i].toString());
		}
	}
}
