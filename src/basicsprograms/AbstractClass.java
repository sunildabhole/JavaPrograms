package basicsprograms;

abstract class Class3 {
	abstract void addition1();

	abstract void addition2();

	void addition3() {
		System.out.println("Implementation");
	}
}

abstract class Class2 extends Class3 {
	abstract void addition4();
}

public class AbstractClass extends Class2 {
	void addition4() {
		System.out.println("Addition4");
	}

	void addition1() {
		System.out.println("Addition1");
	}

	void addition2() {
		System.out.println("Addition2");
	}

	public static void main(String[] args) {
		AbstractClass a = new AbstractClass();
		a.addition1();
		a.addition2();
		a.addition3();
		a.addition4();
	}

}
