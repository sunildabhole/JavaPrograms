package package1;

public class ReverseString2 
{

	public static void main(String[] args) 
	{
		String input="Prabhu";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
		}
		System.out.println(output);
	}

}
