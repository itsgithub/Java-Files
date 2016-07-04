
public class ForSearch {

	public static void main(String[] args) {
		int[] nums = {6,8,10,5,4,12,15};
		int value = 10;
		for (int i : nums) {
			if(value == i){
				break;
			}
		}
		System.out.println("value found!!");
		

	}

}
