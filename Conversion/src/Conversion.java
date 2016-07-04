
public class Conversion {

	public static void main(String[] args) {
		byte b;
		int i = 257;
		double d = 323.142;
		int e = (323%256); 
		
		System.out.println("\nConversion of int to byte");
		
		b = (byte) i;  /* if the integers value is larger 
						than the range of byte, it will 
						be reduced modulo */
		
		
		System.out.println("The value of int in bytes is " +b );
		i = (int) d;
		System.out.println("The value of double in int is " +i);
		b = (byte) d;
		System.out.println("The value of double in bytes is " +b);
		
		System.out.println("The value of e is " +e);
	}

}
