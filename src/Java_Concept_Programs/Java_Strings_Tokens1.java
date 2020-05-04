
/*
 * 
 * Sample Input :   "           He is a very very good boy, isn't he?"
 */

package Java_Concept_Programs;

import java.util.Scanner;

public class Java_Strings_Tokens1 {

	public static void main(String[] args) {
		
		        /* Read input */
		        Scanner scan = new Scanner(System.in);
		        String s = scan.nextLine();
		        scan.close();
		        
		        s = s.trim();      // Removes leading White spaces before string starts
		        
		        /* Check special cases */
		        if (s.length() == 0) {
		            System.out.println(0);
		            return;
		        }
		        
		        
		        /* Split on all non-alphabetic characters */
		       String[] words = s.split("[^a-zA-Z]+");
		        
		        /* Print output */
		        System.out.println(words.length);
		        for (String word : words) {
		            System.out.println(word);
		        }
		    }

}


