
public class BoxDemo4 {

	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		// assign values to instance variables for first object
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		
		// assign values to instance variables for second object
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		
		// volume of mybox1
		System.out.println("Volume of mybox1 is " +mybox1.volume());
		
		// volume of mybox2
		System.out.println("Volume of mybox2 is " +mybox2.volume());
		
	}

}
