package basicsprograms;

public class LocalVariable {
	static void method1() {
		int a = 100;
		System.out.println(a);
	}

	static void method2(int a, int b) {
		System.out.println("a,b");
	}

	public static void main(String[] args) {
		method1();
		method2(100, 100);
	}
}