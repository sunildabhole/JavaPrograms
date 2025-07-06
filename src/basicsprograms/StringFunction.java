package basicsprograms;

public class StringFunction 
{
	public static void main(String[] args) 
	{
		String a="Automation";
		System.out.println(a.length());// Count Length
		System.out.println(a.toUpperCase()); // Convert UpperCase
		System.out.println(a.toLowerCase()); // Convert LowerCase
		System.out.println(a.charAt(5)); // Print input user to character
		
		String b=" Testing";
		System.out.println(a.concat(b)); // Combine 2 String
		System.out.println(b);
		System.out.println(b.trim()); // Remove Unusable Space
		System.out.println(a.isEmpty()); // Find String available or Not
		System.out.println(a.substring(2)); // Starting index of String
		System.out.println(a.substring(2,5)); //Starting & Ending index of String
	}
}
