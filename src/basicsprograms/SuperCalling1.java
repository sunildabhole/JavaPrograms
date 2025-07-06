package basicsprograms;
class Channel
{
	Channel(int a,int b)
	{
		System.out.println("Parent 3");
	}
}
class Referal extends Channel
{
	Referal(int a,double b)
	{
		super(15,17);
		System.out.println ("Parent 2");
	}
}
class Reporter extends Referal
{
	Reporter(double a,double b)
	{
		super(12,2.4);
		System.out.println("Parent 1");
	}
}
public class SuperCalling1 extends Reporter
{
	SuperCalling1() 
	{
		super(2.4323,4.32442);
		System.out.println("Child");
	}

	public static void main(String[] args) 
	{
		new SuperCalling1();
	}

}
