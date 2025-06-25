package basicsprograms;

public class NonStaticMethod {

	void addition()
	{
		System.out.println("Addition is 2");
	}
	public static void main(String[] args) 
	{
		NonStaticMethod n1=new NonStaticMethod();
		n1.addition();
		System.out.println("It is my main method");
	}

}
