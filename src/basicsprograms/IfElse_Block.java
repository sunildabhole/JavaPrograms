package basicsprograms;

import java.util.Scanner;

public class IfElse_Block {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre person Age");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("Person is Eligible to Voting");
		} else {
			System.out.println("Person is not Eligible to Voting");
		}
		sc.close();
	}

}
