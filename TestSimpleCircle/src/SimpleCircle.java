
public class SimpleCircle {
	
	// defining data fields
	double radius;
	
	// initializing constructor methods
	SimpleCircle(double newRadius){
		radius = newRadius;
	}
	
	// calculating area
	double getArea(){
		return radius*radius*Math.PI;
	}
	// calculating perimeter
	double getPerimeter(){
		return 2*radius*Math.PI;
	}
	
	// Set new Radius
	void setRadius(double newRadius){
		radius = newRadius;
	}
}
