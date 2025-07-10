package basicsprograms;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value a");
		int a = s.nextInt();
		System.out.println("Enter value b");
		int b = s.nextInt();
		int sum = a + b;
		System.out.println("Addition is =" + sum);
		s.close();
	}

}
