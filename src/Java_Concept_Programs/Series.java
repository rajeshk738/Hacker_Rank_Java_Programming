
package Java_Concept_Programs;
import java.util.Scanner;
import java.io.*;

public class Series {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		Scanner scan = new Scanner(System.in);
		k = scan.nextInt();
		int a[] = new int[k];
		int b[] = new int[k];
		int c[] = new int[k];
		
		for(int i=0; i<k;i++)
		{
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			c[i] = scan.nextInt();
		}
		
		for(int j=0; j<k;j++)
		{
			printSeries(a[j],b[j],c[j]);
		}
		
	}

	private static void printSeries(int a, int b, int n) {
		// TODO Auto-generated method stub
		int result =0, sum=a;
		int first =0;
		for(int i=0; i<n;i++)
		{
			sum = (int)  ((Math.pow(2,i))*b);
			if(i==0)
			{	
			first = a + sum;
			result =result + first;
			System.out.print(result+" ");
			continue;
			}
			result = sum +result;
			System.out.print(result+" ");
		}
		System.out.println("\n");
	}

	

}
