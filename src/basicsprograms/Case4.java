//What Happens outside the package without becoming subclass
package basicsprograms;

import package1.Case_4;

public class Case4 {

	public static void main(String[] args) {
		Case_4 c = new Case_4();
		c.add_1();// only call public method another package
	}

}
