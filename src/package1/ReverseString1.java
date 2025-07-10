package package1;

public class ReverseString1 {

	public static void main(String[] args) {
		String x = "RAMRAJ";
		String y = "";
		for (int i = 5; i >= 0; i--) {
			char c = x.charAt(i);
			y = y + c;

		}
		System.out.println(y);
	}

}
