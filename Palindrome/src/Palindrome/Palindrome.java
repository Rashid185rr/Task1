package Palindrome;

public class Palindrome {

	public static void main (String args[])
	{
		StringBuffer s = new StringBuffer("level");
		
		String original = s.toString();
		String reverse=s.reverse().toString();
		if(original.equals(reverse))
		{
			System.out.println("word is palindrome");
		}
		else 
		{
			System.out.println("your word is not palindrome");
		}
	}
}
