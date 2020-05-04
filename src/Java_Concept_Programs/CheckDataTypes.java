/* input :
 * 5
 * -150
 * 150000
 * 15000000000
 * 2133333333333333333333333333333
 * -100000000000000
 * 
 */


package Java_Concept_Programs;
import java.util.Scanner;

public class CheckDataTypes {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String a[] = new String[n];
		
			
		for(int i=0; i<n; i++)
		{
				
		   a[i] = scan.next();
		
		}
		
		
		for(int j=0;j<n;j++)
			{
				try {
					
					
				
			
				if(Long.valueOf(a[j])>= Long.MIN_VALUE && Long.valueOf(a[j])<= Long.MAX_VALUE) {
					
					System.out.println(a[j]+" can be fitted in:");
				}
				
				else 
				{
					System.out.println(a[j]+" can't be fitted anywhere.");
					continue;
				}
				
				}
				
				catch(NumberFormatException e) {
					System.out.println(a[j]+" can't be fitted anywhere.");
					continue;
				}
				
				
				
				if(Long.valueOf(a[j])>= Byte.MIN_VALUE && Long.valueOf(a[j])<= Byte.MAX_VALUE)
					System.out.println("* byte");
				
				if(Long.valueOf(a[j])>= Short.MIN_VALUE && Long.valueOf(a[j])<=  Short.MAX_VALUE)
					System.out.println("* short");
				
				if(Long.valueOf(a[j])>= Integer.MIN_VALUE && Long.valueOf(a[j])<= Integer.MAX_VALUE)
					System.out.println("* int");
				
				if(Long.valueOf(a[j])>= Long.MIN_VALUE && Long.valueOf(a[j])<= Long.MAX_VALUE )
					System.out.println("* long");
				
				
			}
			
		
	}

}
