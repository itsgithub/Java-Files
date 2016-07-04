
public class TestSimpleCircle {

	public static void main(String[] args) {
		// creating three circles with different raidus
		SimpleCircle circle1 = new SimpleCircle(1.0);
		SimpleCircle circle2 = new SimpleCircle(25.0);
		SimpleCircle circle3 = new SimpleCircle(125.0);
		
	
		// printing areas of each circle 
		System.out.println("Area of first circle with radius "+ circle1.radius+" is " + circle1.getArea());
		System.out.println("Area of second circle with radius "+ circle2.radius+" is " + circle2.getArea());
		System.out.println("Area of third circle with radius "+ circle3.radius+" is " + circle3.getArea());
		//setting radius of second circle to 100.0
		circle2.setRadius(100.0);
		// printing newRadius of circle2
		System.out.println("New radius of circle2 is " + circle2.radius);
	}

}
