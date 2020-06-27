package Java_Concept_Programs;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Java_Big_Integer {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        
        BigInteger a = new BigInteger(n);
        
        /*
        I use isProbablePrime() with certainty = 10 to achieve 99.9% accuracy. 
        However, even certainty = 1 (which achieves 50% accuracy) is enough to 
        pass the HackerRank test cases.
        isProbablePrime() is always 100% certain if it tells you if a number 
        is "not prime". If it says "prime", it's only 99.9% certain. It may be 
        the case that it just hasn't found a prime number number that divides 
        the BigInteger yet.
        */
        
        System.out.println(a.isProbablePrime(10)?"prime":"not prime");
        
        scanner.close();
    }
}



