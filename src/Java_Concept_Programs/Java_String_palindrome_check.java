/*
 * Sample Input

madam


Sample Output

Yes


 */

package Java_Concept_Programs;

import java.util.Scanner;

public class Java_String_palindrome_check {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		int j = s.length()-1;
		int i = 0;
		boolean flag = true;
		
		while(i<=j)
		{
			if(s.charAt(i) != s.charAt(j))
			{
				flag = false;
				break;
			
			}
			i++;
			j--;
		}
		
		if(flag)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
