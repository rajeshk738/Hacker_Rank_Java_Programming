/*
 * Sample Input 0

anagram
margana


Sample Output 0

Anagrams
-----------------------------------

Sample Input 1

anagramm
marganaa

Sample Output 1

Not Anagrams

 */

package Java_Concept_Programs;

import java.util.Scanner;

public class Java_Anagrams_Compare {


		   static boolean isAnagram(String a, String b) {
		        // Complete the function
			   if(a.length() != b.length())
				   return false;
			   else
			   {
				   String a1 = sort(a.toLowerCase());
				   String b1 = sort(b.toLowerCase());
				   if(a1.equals(b1))
					   return true;
				   else
					   return false;
			   }
			   
			   
		    }

		   
		  private static String sort(String c) {
			  	
			  char[] s = c.toCharArray();
			  char temp;
			  for(int i=0; i<c.length()-1;i++)
				  for(int j=0;j<c.length()-1;j++)
				  {
					  if(s[j] > s[j+1])
					  {
						temp = s[j+1];
						s[j+1] = s[j];
						s[j] = temp;
					  }
				  }

			return String.copyValueOf(s);
			  
			
		}


		public static void main(String[] args) {
		    
		        Scanner scan = new Scanner(System.in);
		        String a = scan.next();
		        String b = scan.next();
		        scan.close();
		        boolean ret = isAnagram(a, b);
		        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		    }
		


	}


