
public class BoxDemo7 {

	public static void main(String[] args) {
		Box mybox1 = new Box(10,20,15);
		Box mybox2 = new Box(3,6,9);
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Volume of box1 is " +vol);
		
		// get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume of box2 is " +vol);

	}

}
