
public class A {
	//int i,j;
	
	void showij(int i, int j){
		System.out.println("i and j: " + i + " " + j);
	}
}
class B extends A {
	//int k;
	
	void showk(int k){
		System.out.println("k: " + k);
		
	}
	void sum(int i, int j, int k){
		System.out.println("i+j+k: " + (i+j+k));
	}
}