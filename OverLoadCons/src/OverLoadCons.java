
public class OverLoadCons {

	public static void main(String[] args) {
		Box mybox1 = new Box(5,6,7);
		Box mybox2 = new Box();
		Box cube = new Box(7);
		
		double vol;
		// get volume of box 1
		vol = mybox1.volume();
		System.out.println("Volume of Box1 is " +vol);
		
		// get volume of box2
		vol = mybox2.volume();
		System.out.println("Volume of Box2 is " +vol);
		
		// get volume of cube;
		vol = cube.volume();
		System.out.println("Volume of Cube is " +vol);
	}

}
