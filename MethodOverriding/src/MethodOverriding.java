
public class MethodOverriding {

	public static void main(String[] args) {
		Figure f = new Figure(10,10);
		Rectangle r = new Rectangle(9,7);
		Triangle t = new Triangle(10,20);
		
		Figure figref;
		
		figref = f;
		System.out.println("Area of Figure is: " +figref.area());
		
	    figref = r;
	    System.out.println("Area of rectangle is: " +figref.area());
	    
	    figref = t;
	    System.out.println("Area of triangle is: " +figref.area());

	}

}
