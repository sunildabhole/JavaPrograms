package basicsprograms;

import java.util.Arrays;

public class ArraysIteration {

	public static void main(String[] args) {
		int array1[] = new int[4];
		array1[0] = 32;
		array1[1] = 67;
		array1[2] = 36;
		array1[3] = 45;

		int array2[] = new int[4];
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}

}
