package basicsprograms;
interface Amazon
{
	void add();
}
interface Flipcart
{
	void subtract();
}
public class Interface implements Amazon,Flipcart
{
	public static void main(String [] args)
	{
		Interface i=new Interface();
		i.subtract();
		i.add();
	}

	public void subtract() 
	{
		System.out.println("sub");
	}

	public void add()
	{
		System.out.println("add");
	}
}
