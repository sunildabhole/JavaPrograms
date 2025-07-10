package basicsprograms;

public class StringMatches {

	public static void main(String[] args) {
		String a = "cat";
		boolean b1 = a.matches("...");// Matches String with three letters
		System.out.println(b1);

		String a2 = "cat";
		boolean b2 = a2.matches("c(.*)");// Matches String with first letter
		System.out.println(b2);

		String a3 = "cat";
		boolean b3 = a3.matches("(..*)t");// Matches String with last letter
		System.out.println(b3);

		String a4 = "Manish";
		boolean b4 = a4.matches("(.*)n(.*)");// Matches String with middle letter
		System.out.println(b4);
	}

}
