package basicsprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysHumanInput {

	public static void main(String[] args) {
		int rollno[] = new int[4];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			rollno[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
		s.close();
	}

}
