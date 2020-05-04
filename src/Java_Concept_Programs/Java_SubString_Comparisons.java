/* 
 * 
Sample Input 0

welcometojava
3

Sample Output 0

ava
wel


We then return the first (lexicographically smallest) substring and the last (lexicographically largest) 
substring as two newline-separated values (i.e., ava\nwel).


 */

package Java_Concept_Programs;

import java.util.*;

public class Java_SubString_Comparisons {


	    public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        String s1 = s + " ";
	        int size = s.length()-k;
	        
	        
	        String arr[] = new String[size+1] ;
	        
	        
	        for(int i=0; i<=size; i++)
	        {
	        	arr[i] = s1.substring(i, i+k);
	        	
	        }
	        
	        for(int k1=0; k1<arr.length-1;k1++)
	        {
	        	for(int j=0;j<arr.length-1;j++)
	        	{
	        	if(arr[j].compareTo(arr[j+1]) > 0)
	        	{
	        		String temp = arr[j+1];
	        		arr[j+1] = arr[j];
	        		arr[j] = temp;
	        	}
	        	}
	        		
	        }
	        
	        smallest = arr[0];
	        largest = arr[arr.length-1];
	        
	        
	        
	        return smallest + "\n" + largest;
	    }


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }
	}