package basicsprograms;

public class ArraysCheck {

	public static void main(String[] args) {
		int students[] = new int[4];
		students[0] = 64;
		students[1] = 45;
		students[2] = 75;
		students[3] = 35;

		int notocheck = 35;
		for (int i = 0; i < 4; i++) {
			if (notocheck == students[i]) {
				System.out.println(notocheck + " This number Present in array position " + i);
			}
		}
	}

}
