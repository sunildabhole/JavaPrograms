package basicsprograms;

import java.util.Arrays;

public class WrapperClasss 
{
	static int count_of_alphabet;
	static int count_of_numeric;
	static int count_of_speces;
	public static void main(String[] args) 
	{
		String s="kv no 2 bangalore";
		char c1[]=s.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<s.length();i++)
		{
			boolean b1=Character.isAlphabetic(c1[i]);
			
			if(b1==true)
			{
				count_of_alphabet++;
			}
			boolean b2=Character.isDigit(c1[i]);
			if(b2==true)
			{
				count_of_numeric++;
			}
			boolean b3=Character.isWhitespace(c1[i]);
			if(b3==true)
			{
				count_of_speces++;
			}
		}
		System.out.println("The Count of Alphabets is="+count_of_alphabet);
		System.out.println("The Count of Numbers is="+count_of_numeric);
		System.out.println("The Count of Spaces is="+count_of_speces);
	}
}
