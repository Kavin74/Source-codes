import java.util.*;

class RemoveDuplicates
{
	/* Function removes duplicate characters from the string
	This function work in-place */
	void removeDuplicates(String str)
	{
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
			lhs.add(str.charAt(i));
		
		// print string after deleting duplicate elements
		for(Character ch : lhs)
			System.out.print(ch);
	}
	
	/* Driver program to test removeDuplicates */
	public static void main(String args[])
	{
		String str = "geeksforgeeks";
		RemoveDuplicates r = new RemoveDuplicates();
		r.removeDuplicates(str);
	}
}
