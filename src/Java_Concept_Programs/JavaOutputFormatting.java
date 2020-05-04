// Java Output Formatting string 15 characters and integer 3digit

package Java_Concept_Programs;
import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = new String[3];
		int k[] = new int[3];
		Scanner scan = new Scanner(System.in);
	
		for(int i=0;i<3;i++)
		{
			s[i] = scan.next();
			k[i] = scan.nextInt();	
		}
		
		System.out.println("==============================");	 
		for(int j=0; j<3;j++)
			printer(s[j],k[j]);
		
		System.out.println("==============================");
	}

	  public static void printer(String s, int k) {
		// TODO Auto-generated method stub
		  int size = s.length();
		  int g = 15-size;
		  int intSize = String.valueOf(k).length();
		  int m = 3-intSize;
		  System.out.print(s);
		  while(g>0)
		  {
			  System.out.print(" ");
			  g--;
		  }
		  
		  while(m>0)
		  {
			  System.out.print(0);
			  m--;
		  }
		  System.out.print(k);
		  System.out.println();
		  
		  
	}

}
