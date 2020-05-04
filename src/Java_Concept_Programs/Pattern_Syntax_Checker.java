/*
 * Sample Input

3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat


Sample Output

Valid
Invalid
Invalid

For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.
 * 
 */

package Java_Concept_Programs;

import java.util.Scanner;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Pattern_Syntax_Checker {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int nooftestcases = Integer.parseInt(scan.nextLine());
		String arr[] = new String[nooftestcases];
		while(nooftestcases > 0)
		{
			arr[nooftestcases-1] = scan.nextLine();
			nooftestcases--;
		}
		
		int size = arr.length;
		
		while(size>0)
		{
			checkpattern(arr[size-1]);
			size--;
		}
		

	}

	private static void checkpattern(String string) {
		
		try {
		Pattern.compile(string);
		System.out.println("Valid");
		}
		catch(PatternSyntaxException e)
		{
			System.out.println("Invalid");
		}
		
		
	}

}
