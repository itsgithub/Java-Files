
public class ArrayAverage {

	public static void main(String[] args) {
		double[] arrayAvg = {10.1, 11.2,12.3, 13.4, 14.5};
		double sum =0;
		for (int i = 0; i < 5;  i++){ 
			sum =+ arrayAvg[i];
		}
		System.out.println("The average is " + sum/5);
	}

}
