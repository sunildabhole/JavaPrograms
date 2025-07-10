package basicsprograms;

class Super1 {
	Super1(int a) {
		System.out.println("Constructor1");
	}
}

public class SuperCalling2 extends Super1 {
	SuperCalling2() {
		super(10);
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		new SuperCalling();
	}

}
