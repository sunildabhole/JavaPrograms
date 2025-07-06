package basicsprograms;
class Parent1
{
	Parent1()
	{
		System.out.println("Parent");
	}
}
class Parent2 extends Parent1
{
	Parent2()
	{
		super();
		System.out.println("Parent2");
	}
}
public class SuperCalling extends Parent2
{
	SuperCalling()
	{
		super();
		System.out.println("SuperCalling");
    }
	public static void main(String[] args) 
	{
		new SuperCalling();
	}
}