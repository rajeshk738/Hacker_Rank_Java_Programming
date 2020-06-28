package Java_Concept_Programs;

import java.math.BigInteger;
import java.util.Scanner;

public class Java_BigInteger_Class {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		
		//converting to BigInteger using the class
		BigInteger a = new BigInteger(s1);
		BigInteger b = new BigInteger(s2);
		
		BigInteger mult = a.multiply(b);
		BigInteger add = a.add(b);
		
		System.out.println(add);
		System.out.println(mult);
	}

}
