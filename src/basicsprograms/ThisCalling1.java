package basicsprograms;

public class ThisCalling1 {
	ThisCalling1() {
		System.out.println("1st");
	}

	ThisCalling1(int a) {
		this();
		System.out.println("2nd");
	}

	ThisCalling1(int a, int b) {
		this(12);
		System.out.println("3rd");
	}

	ThisCalling1(int a, double b) {
		this(12, 12);
		System.out.println("4th");
	}

	public static void main(String[] args) {
		new ThisCalling1(12, 1.1);
	}

}
