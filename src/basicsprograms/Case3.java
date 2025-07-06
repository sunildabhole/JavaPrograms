//What Happens outside the package becoming subclass
package basicsprograms;

import package1.Case_3;

public class Case3 extends Case_3 //inheritance concept
{

	public static void main(String[] args) 
	{
		Case3 c3=new Case3();
		c3.add1();//inheritance concept calling public method
		c3.div();//inheritance concept calling protected method
	}
}
