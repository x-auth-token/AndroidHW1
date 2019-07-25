/**
 * 
 * @author Pavel Mayzenberg
 * @version 1.0
 */
public class Main {
	public static void main(String[] args) {
		double sideLength = 1;
		
		// Create figures
		Polygon polygon = new Polygon(sideLength);
		EquilateralTriangle eqTriangle = new EquilateralTriangle(sideLength);
		Square square = new Square(sideLength);
		RegularPentagon rPentagon = new RegularPentagon(sideLength);
		RegularHexagon rHexagon	= new RegularHexagon(sideLength);
		
		// Create array of figures for nicer printing
		Polygon polygonArr[] = {polygon, eqTriangle, square, rPentagon, rHexagon};
		
		// Print the result of area calculation
		for (int i = 0; i < polygonArr.length; i++) {
			System.out.println(polygonArr[i].toString());
		}
	}
}
