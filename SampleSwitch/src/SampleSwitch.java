
public class SampleSwitch {

	public static void main(String[] args) {
		for(int i = 10; i<16; i++){
			
			switch (i) {
			case 10:
				System.out.println("i is ten");
				break;
			case 11:
				System.out.println("i is Eleven");
				break;
			case 12:
				System.out.println("i is twelve");
				break;
			case 13:
				System.out.println("i is thirteen");
				break;
			default:
				System.out.println("i is greater than thirteen");
				break;
			}
			
		}

	}

}
