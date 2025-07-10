package basicsprograms;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Radius of circle is r");
		double r = s.nextDouble();
		double area = 3.14 * r * r;
		System.out.print("Area of circle is =" + area);
		s.close();
	}

}