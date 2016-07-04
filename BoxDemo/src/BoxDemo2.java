
public class BoxDemo2 {

	public static void main(String[] args) {
		// creating 2 object
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol1;
		double vol2;
		
		// assigning values to instance variables of mybox1
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		
		// assigning values to variables of mybox2
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		
		
		vol1 = mybox1.width * mybox1.height * mybox1.depth ;
		vol2 = mybox2.width * mybox2.height * mybox2.depth ;
		
		
		System.out.println("Volume of mybox1 is " +vol1);
		System.out.println("Volume of mybox2 is " +vol2);
	}

}
