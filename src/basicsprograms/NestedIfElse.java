package basicsprograms;

import java.util.*;

public class NestedIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gender");
		String gender = sc.next();
		if (gender == "m") {
			System.out.println("Enter age");
			int age = sc.nextInt();
			if (age <= 10) {
				System.out.print("For children free tickets");
			} else {
				System.out.print("For children age 10+ paid tickets");
			}
		} else {
			System.out.println("For female free tickets");
		}
		sc.close();
	}
}
