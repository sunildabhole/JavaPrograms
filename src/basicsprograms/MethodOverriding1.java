package basicsprograms;

class Parent_1 {
	void add() {
		int a, b, sum;
		a = 20;
		b = 30;
		sum = a + b;
		System.out.println("Addition of Parent Class = " + sum);
	}
}

public class MethodOverriding1 extends Parent_1 {
	void add() {
		super.add();
		int a, b, sum;
		a = 10;
		b = 20;
		sum = a + b;
		System.out.println("Addition of Child Class = " + sum);
	}

	public static void main(String[] args) {
		MethodOverriding1 m1 = new MethodOverriding1();
		m1.add();
	}
}
