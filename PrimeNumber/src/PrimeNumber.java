import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		//int n =11;
		int n = scanner.nextInt();
		
		int count= 0;
		for(int i=2; i<n; i++ ){
			if(n%i == 0){
				count = 1;
				break;	
			}
		}
			if(count == 1){
				System.out.println("The given number "+n+ " is not a prime");
			}else{
				System.out.println("The given number "+n+ " is  a prime");
			}
		
		

	}

}
