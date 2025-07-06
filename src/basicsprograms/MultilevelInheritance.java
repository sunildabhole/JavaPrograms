package basicsprograms;
class Class1
{
	static void add()
	{
		System.out.println("sum");
	}
}

class Class_2 extends Class1
{
	void sub()
{
	System.out.println("sub");
}
}

public class MultilevelInheritance extends Class_2
{
	static void mul()
	{
		System.out.println("mul");
	}
	static void div()
	{
		System.out.println("div");
	}
	public static void main(String[] args) 
	{
		MultilevelInheritance m1=new MultilevelInheritance();
		add();
		m1.sub();
		mul();
		div();
	}
	}