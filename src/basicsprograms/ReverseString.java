package basicsprograms;

public class ReverseString {
	public static void main(String[] args) {
		String in = "abcd";
		String out = "";
		for (int i = 3; i >= 0; i--) {
			char c1 = in.charAt(i);
			out = out + c1;
		}
		System.out.println(out);
	}

}
