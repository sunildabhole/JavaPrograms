package basicsprograms;

public class ThisCalling2 
{
	ThisCalling2()
	{
		this(12);
		System.out.println("1st");
	}
	ThisCalling2(int a)
	{
		this(12,13);
		System.out.println("2nd");
	}
	ThisCalling2(int a,int b)
	{
		System.out.println("3rd");
	}
	public static void main(String[] args) 
	{
		new ThisCalling2();
			
	}
}