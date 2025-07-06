package basicsprograms;

public class ThisCalling 
{
	ThisCalling(int a)
	{
		this(15,16);
		System.out.println("1st");
	}
	ThisCalling(int a,int b)
	{
		this(12,13,14);
		System.out.println("2nd");
	}
	ThisCalling(int a,int b,int c)
	{
		this(12,"Sunil");
		System.out.println("3rd");
	}
	ThisCalling(int a,String b)
	{
		System.out.println("4th");
	}
	public static void main(String[] args) 
	{
		new ThisCalling(12);
	}

}
