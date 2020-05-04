
package Java_Concept_Programs;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Static_Initializer {
	
	 static int B =0;
	 static int H =0;
	 static boolean flag = true;
	
	static{
	    Scanner scan = new Scanner(System.in);
	    B = scan.nextInt();
	    H = scan.nextInt();
	   

	    if(B<1 || H<1)
	    {
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	        flag = false;
	    }

	    }

	public static void main(String[] args){
		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}
