package package1;

public class ReverseString3 {

	public static void main(String[] args) {
		String s1 = "Golya";
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			char c2 = s1.charAt(i);
			s2 = s2 + c2;
		}
		System.out.println(s2);
	}

}
