package basicsprograms;

public class Operators 
{
	static void addition()
	{
		int a=100;
		int b=200;
		int add=a+b;
		System.out.println("Addition is ="+add);
	}
	static void subtraction()
	{
		int a=100;
		int b=200;
		int sub=b-a;
		System.out.println("Subtraction is ="+sub);
	}
	static void multiplication()
	{
		int a=100;
		int b=200;
		int mul=b*a;
		System.out.println("Multiplication is ="+mul);
	}
	static void division()
	{
		int a=100;
		int b=200;
		int div=b/a;
		System.out.println("Division is ="+div);
	}
	static void modulus()
	{
		int a=100;
		int b=200;
		int mod=b%a;
		System.out.println("Modulus is ="+mod);
	}
	public static void main(String [] args)
	{
		addition();
		subtraction();
		multiplication();
		division();
		modulus();
	}
	
}
