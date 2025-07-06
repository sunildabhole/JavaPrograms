package package1;



public class ReverseString 
{

	public static void main(String[] args) 
	{
		String s1="Sunil";
		String s2="";
		for(int i=4;i>=0;i--)
		{
			char c1=s1.charAt(i);
			s2=s2+c1;
		}
		
		System.out.println(s2);
	}

}
