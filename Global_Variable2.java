package basicsprograms;

public class Global_Variable2 
{
	static int a=100;
	static int b=200;
	
	static void sum()
	{
		int sum=a+b;
		System.out.println("Addition of a & b is = "+sum);
	}
	
	static void sub()
	{
		int sub=b-a;
		System.out.println("Subtraction of a & b is = "+sub);
	}
	
	static void mul()
	{
		int mul=a*b;
		System.out.println("Multiplication of a & b is = "+mul);
	}
	
	static void div()
	{
		int div=b/a;
		System.out.println("Division of a & b is = "+div);
	}
	
	static void mod()
	{
		int mod=b%a;
		System.out.println("Modulus of a & b is = "+mod);
	}
	public static void main(String[] args) 
	{
		sum();
		sub();
		mul();
		div();
		mod();
	}

}
