/*
 * Output Format

Print the substring in the inclusive range from  to .


Sample Input

Helloworld
3 7

Sample Output

lowo


 */

package Java_Concept_Programs;

import java.util.Scanner;

public class Java_Substring {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(s.substring(a, b));
		
	}

}
