package basicsprograms;

import java.util.*;

public class AreaSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter of side of square");
		int a = sc.nextInt();
		int Area = a * a;
		System.out.println("Area of Square is= " + Area);
		sc.close();
	}
}
