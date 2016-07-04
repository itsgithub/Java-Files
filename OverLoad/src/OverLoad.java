
public class OverLoad {

	public static void main(String[] args) {
			OverLoadDemo ob = new OverLoadDemo();
			double result;
			
			// calling methods
			ob.test();
			ob.test(10);
			ob.test(10, 15);
			result = ob.test(123.25);
			
			System.out.println("Result of ob.test(123.25)"
					+ " is " +result  );
			
	}

}
