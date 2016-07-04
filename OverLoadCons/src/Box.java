
public class Box {
	double height;
	double width;
	double depth;
	
	//constructor with 3 parameters
	Box(double h, double w, double d){
		height = h;
		width = w;
		depth = d;
	}
	
	// constructor with no parameters
	Box() {
		height = -1;
		width = -1;
		depth = -1;
	}
	
	// constructor with one parameter
	Box(double len) {
		height = width = depth = len;
	}
	// compute and return volume
	double volume(){
		return height*width*depth;
	}
	
}
