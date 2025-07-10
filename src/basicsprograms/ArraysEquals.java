package basicsprograms;

import java.util.Arrays;

public class ArraysEquals {
	public static void main(String[] args) {
		int[] a = new int[4];
		a[0] = 35;
		a[1] = 55;
		a[2] = 24;
		a[3] = 64;
//..........................................		
		int[] b = new int[4];
		b[0] = 35;
		b[1] = 55;
		b[2] = 24;
		b[3] = 64;
		boolean b1 = Arrays.equals(a, b);// TO check two arrays equals
		System.out.println(b1);
	}
}
