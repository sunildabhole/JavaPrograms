package basicsprograms;

public class MainMethodOverlo 
 {

	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		main();
		main("Sunil",'M');
	}
	public static void main()
	{
		System.out.println("Main method without argument");
	}
	public static void main(String name,char gender)
	{
		System.out.println("Main  method with argument Name & Gender");
	}
}
