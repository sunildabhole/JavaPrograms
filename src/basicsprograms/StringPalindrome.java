package basicsprograms;

public class StringPalindrome {
	public static void main(String[] args) {
		String s1 = "mom";
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			char c = s1.charAt(i);
			s2 = s2 + c;
		}
		System.out.println(s2);
		boolean b1 = s1.equals(s2);
		if (b1 == true) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("It is not Palindrome");
		}
	}
}
