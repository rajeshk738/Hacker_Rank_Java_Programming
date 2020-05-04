
package Java_Concept_Programs;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        String s = scan.next();
       	int i = scan.nextInt();
       	
       	int size = String.valueOf(i).length();
       	System.out.println(size);
       	
        System.out.print(s);
        
        System.out.print(i);
    }

	
}