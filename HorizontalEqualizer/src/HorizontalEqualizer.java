class HorizontalEqualizer{
	public static void main(String ars[]){
		int[] data = {3, 5, 3, 1, 4};
		/*int max = 0; 
		for(int i = 0; i < data.length; i++){
			if (max < data[i])
				max = data[i];
		}*/
		for (int j = 5; j >= 1; j--){
			for(int i = 0; i < data.length; i++){
				if(data[i] >= j){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}		
			System.out.println();  

		}

	}
}
