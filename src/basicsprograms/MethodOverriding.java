package basicsprograms;

class Parent_Class {
	void add() {
		System.out.println("Parent");
	}
}

public class MethodOverriding extends Parent_Class {
	void add() {
		super.add();
		System.out.println("Child");
	}

	public static void main(String[] args) {
		MethodOverriding m = new MethodOverriding();
		m.add();
	}

}
