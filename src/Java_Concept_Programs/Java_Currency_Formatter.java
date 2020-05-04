package Java_Concept_Programs;

import java.util.*;
import java.text.NumberFormat;  

public class Java_Currency_Formatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf.format(payment);
        
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf2.format(payment);
        
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf3.format(payment);
        
        NumberFormat nf4 = NumberFormat.getCurrencyInstance(new Locale("en","IN")); // we don't have Locale.INDIA
        String india = nf4.format(payment);
        
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}