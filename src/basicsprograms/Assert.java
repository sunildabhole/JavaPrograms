package basicsprograms;

public class Assert {

	public static void main(String[] args) {
		int age = 21;
		assert age >= 21 : "It is not expected age";
		System.out.print("This person age is " + age);
	}

}
