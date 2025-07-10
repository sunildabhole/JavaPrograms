package basicsprograms;

public class StaticMethod {
	static void method1() {
		System.out.println("A");
	}

	static void method2() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		method1();
		method2();
		System.out.println("Sunil");
		method3();
		method4();
	}

	static void method3() {
		System.out.println("C");
	}

	static void method4() {
		System.out.println("D");
	}

}
