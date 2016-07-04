
public class Box {
	double width;
	double height;
	double depth;
	
	// creating box constructor
		Box(double w, double h, double d){
			System.out.println("Constructing Box");
			width = w;
			height = h;
			depth = d ;		
		
		}
	
	/* defining a method
	 to compute and return volume*/
	
	double volume(){
		return width * height * depth;
	}
	
}
