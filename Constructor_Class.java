package basicsprograms;

public class Constructor_Class 
{
	Constructor_Class()
	{
		System.out.println("1st");	
	}
	Constructor_Class(int a)
	{
		System.out.println("2nd");
	}
	public static void main(String[] args) 
	{
		new Constructor_Class();
		new Constructor_Class(100);
	}

}
