package Java_Concept_Programs;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Java_SHA_256 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(md5_Encryption(s));
    }

    private static StringBuilder md5_Encryption(String input) {
        try { 

            // Static getInstance method is called with hashing MD5 
            MessageDigest md = MessageDigest.getInstance("SHA-256"); 

            // digest() method is called to calculate message digest 
            // of an input digest() return array of byte 
            byte[] messageDigest = md.digest(input.getBytes()); 

            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest); 

            StringBuilder hashtext = new StringBuilder(no.toString(16));  
            
            while (hashtext.length() < 64) { 
                hashtext.insert(0,'0');
            } 
            return hashtext; 
        } 

        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
        

    }

}
