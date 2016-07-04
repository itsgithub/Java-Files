import java.util.Scanner;

public class ComputeAverage {

	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		// calculating average of three numbers
		double average = (number1+number2+number3)/3 ;
		System.out.println("Average of three numbers is " +average);
	}

}
