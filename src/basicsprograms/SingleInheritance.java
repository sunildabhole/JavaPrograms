package basicsprograms;

class One {
	static void add() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
	}

	static void sub() {
		int a = 10;
		int b = 20;
		int sub = b - a;
		System.out.println(sub);
	}
}

public class SingleInheritance extends One {
	static void mul() {
		int a = 10;
		int b = 20;
		int mul = a * b;
		System.out.println(mul);
	}

	static void div() {
		int a = 10;
		int b = 20;
		int div = b / a;
		System.out.println(div);
	}

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
	}
}
