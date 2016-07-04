
public class SimpleInheritance {

	public static void main(String[] args) {
		A superob = new A();
		B subobj = new B();
		
		// the super class maybe used by itself
		//superob.i = 10;
		//superob.j = 20;
		System.out.println("Contents of superob: ");
		superob.showij(10,20);
		System.out.println();
		// the subclass has to access all the public members of the
		// super class
		
		System.out.println("Contents of subobj: ");
		subobj.showij(7, 8);
		subobj.showk(9);
		System.out.println();

		System.out.println("Sum of i, j andk in subobj: ");
		subobj.sum(7, 8, 9);

	}

}
