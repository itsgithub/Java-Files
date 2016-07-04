
public class A {
	public interface NestedIF{
		boolean isNotNegative(int x);
	}
}

class B implements A.NestedIF {
	public boolean isNotNegative(int x){
		if (x >0) {
			System.out.println("X is positive: " +x);
			return true;
		}else {
			System.out.println("X is negative: " +x);
			return false;
		}
	}
	void displayBMethod(){
		System.out.println("dislay from B Method");
	}
}

class NestedIFDemo {
public static void main(String args[]){
	A.NestedIF nestif = new B();
	nestif.isNotNegative(-5);
	nestif.isNotNegative(10);
	B display = new B();
	display.displayBMethod();
}
}