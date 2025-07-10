package basicsprograms;

import java.util.*;

public class CircumferanceCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculate cercumferance of Circle");
		System.out.println("Enter Raduus of Circle");
		double r = sc.nextDouble();
		double circumferance = 2 * 3.14 * r;
		System.out.println("Circumferance of Circle is =" + circumferance);
		sc.close();
	}

}
