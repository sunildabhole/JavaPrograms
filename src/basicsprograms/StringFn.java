package basicsprograms;

public class StringFn {
	public static void main(String[] args) {
		String s = "Sunil";
		boolean b1 = s.equalsIgnoreCase("sunil"); // Ignore case
		System.out.println("Diplay ignore case Strings are equal=> " + b1);

		String s2 = "kv no 2";
		String s3 = s2.replace("k", "n"); // Replace k with n
		System.out.println("Diplay replace string with k=n=> " + s3);

		String s4 = "I have a boy";
		String s5 = s4.replace("boy", "girl"); //// Replace boy with girl
		System.out.println("Diplay replace string with boy=girl=> " + s5);

		String s6 = "kv no 2";
		String s7 = s6.replace("2", " "); // Replace 2 with empty
		System.out.println("Diplay replace string with k=n=> " + s7);

		String s8 = "kv no 2";
		String s9 = s8.replaceAll("[a-z]", " "); // Replace all alphabets with nothing
		System.out.println("Diplay replace all alphabets with nothing=> " + s9);

		String sunil = "Sunil Samadhan Dabhole";
		String sonya = sunil.replaceAll("[A-Z]", " "); // Replace all Capital letter with nothing
		System.out.println("Diplay replace all Capital letter with nothing=> " + sonya);

		String a = "Sonya 5020";
		String a2 = a.replaceAll("[0-9]", " "); // Replace all numbers with nothing
		System.out.println("Diplay replace all numbers with nothing=> " + a2);
	}
}