package basicsprograms;

import java.util.*;

public class AreaRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Rectangle");
		int l = sc.nextInt();
		System.out.println("Enter base of Rectangle");
		int b = sc.nextInt();
		int Area = l * b;
		System.out.println("Area of Rectangle is= " + Area);
		sc.close();
	}
}
