package basicsprograms;
import java.util.*;
public class AreaTriangle 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base of Triangle");
		double b=sc.nextDouble();
		System.out.println("Enter Height of Triangle");
		double h=sc.nextDouble();
		double Area=0.5*b*h;
		System.out.println("Area of Triangle is= "+Area);
		sc.close();
	}

}
