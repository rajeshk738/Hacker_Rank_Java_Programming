

package Java_Concept_Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Java_Regex_pattern {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.nextLine();
            System.out.println("\n"+IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
	
public static	String str = "(2[0-4]\\d|25[0-5]|[01]\\d\\d|\\d\\d?|\\d)";
			
public static	String str1 = "([01]?\\d\\d? | 2[0-4]\\d | 25[0-5])";
	
public static String pattern  = "^"+str+"\\."+str+"\\."+str+"\\."+str+"$";
			                

}