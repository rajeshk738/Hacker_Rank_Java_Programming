

package Java_Concept_Programs;
import java.util.Scanner;

public class ExampleScanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        
        int i = scan.nextInt();
        double d =scan.nextDouble();
        scan.nextLine(); // ---> reading input line to go to next line for string input
        String s = scan.nextLine();

        // Write your code here.	

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

