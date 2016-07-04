
public class SumOfTenNumbers {

	public static void main(String[] args) {
		int[] myArray = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
		int sum = 0;
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
			sum+= myArray[i];
		}
	
	System.out.println("The sum of all numbers in the array is " +sum);
	System.out.println("Total is " +sum);
	
	
	}
	

}
