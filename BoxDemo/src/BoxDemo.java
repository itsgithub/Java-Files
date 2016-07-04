
public class BoxDemo {

	public static void main(String[] args) {
		Box mybox = new Box(); // creating a new object by name
									//mybox
		double vol;
		mybox.width = 10;  // assigning values to instance variables
		mybox.height = 20;
		mybox.depth = 15;
		
		vol = mybox.width * mybox.height * mybox.depth ;
		
		System.out.println("Volume is " +vol);
	}

}
