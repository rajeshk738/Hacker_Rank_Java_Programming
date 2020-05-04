/*
 * 
 * Sample Input

He is a very very good boy, isn't he?


Sample Output

10
He
is
a
very
very
good
boy
isn
t
he


Explanation

We consider a token to be a contiguous segment of alphabetic characters. 
 */

package Java_Concept_Programs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Java_String_Tokens {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        // Write your code here.
  
        
 /*   // Using StringTokenizer class easily solve the problem
  * 
  *     StringTokenizer tk = new StringTokenizer(s, " , ? ' @ . ! _ \\");  // here split delimiters are given with space in single double quote
        
        System.out.println(tk.countTokens());
        
        while(tk.hasMoreTokens())
        {
        	System.out.println(tk.nextToken());
        }
        
        
        */
        
    //    String[] strs = s.split("\\, |\\! |\\? |\\. |\\_|\\'|\\.|\\, |\\?|\\!|\\_ |\\@|\\s");  // use or operator for separation of delimiters -- \\ before represent the delimmiter
        
        String[] strs = s.split("[^a-zA-Z]+");
        
        System.out.println(strs.length);
        
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        
   
	}
	}
}


