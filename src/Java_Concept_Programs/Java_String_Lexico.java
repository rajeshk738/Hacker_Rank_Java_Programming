/*  Sample Input 0

hello
java


Sample Output 0

9
No
Hello Java

There are three lines of output:
For the first line, sum the lengths of A  and B.
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both  A and B and print them on a single line, separated by a space.
 * 
 *	
 */

package Java_Concept_Programs;

import java.util.Scanner;

public class Java_String_Lexico {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println((A.length() + B.length()));
        
        if(A.compareTo(B) > 0)
        	System.out.println("Yes");
        else
        	System.out.println("No");
        
        A = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase();
        
        B = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();
        
        System.out.println(A+" "+B);
        
        

	}

}
