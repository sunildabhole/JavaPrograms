package basicsprograms;
class Parent
{
	static void main()
	{
		System.out.println("Parent");
	}
}
class Child1 extends Parent
{
	public static void main(String [] args)
	{
		System.out.println("child1");
		main();	
	}
}

