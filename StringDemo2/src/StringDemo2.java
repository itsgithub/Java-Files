
public class StringDemo2 {
	public static void main(String args[]){
		String str1 = "First String";
		String str2 = "Second String";
		String str3 = str1;
		System.out.println("Length of str1 is " + str1.length());
		System.out.println("Character at index 4 of str2 is " + str2.charAt(4));
		if (str1.equals(str2)) {
			System.out.println("str1 == str2");
		} else {
			System.out.println("str1 != str2");
		}
		if (str1.equals(str3)) {
			System.out.println("str1 == str3");
		} else {
			System.out.println("str1 != str3");
		}
	}
}
