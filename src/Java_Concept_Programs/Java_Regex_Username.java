/*
 * Username Checker
 * the username consists of 8 to 30 characters inclusive
 * The username can only contain alphanumeric characters and underscores (_).Alphanumeric characters describe the character set consisting of lowercase characters[a-z] , uppercase characters[A-Z] , and digits[0-9] .
 * The first character of the username must be an alphabetic character, i.e., either lowercase character[a-z] or uppercase character[A-Z]
 * 
 */

package Java_Concept_Programs;

	import java.util.Scanner;
	
	class UsernameValidator {
	    /*
	     * Write regular expression here.
	     */
	    public static final String regularExpression = "^([a-zA-Z]\\w{7,29})$";
	    		
	}


	public class Java_Regex_Username {
	    private static final Scanner scan = new Scanner(System.in);
	    
	    public static void main(String[] args) throws Exception {
	        int n = Integer.parseInt(scan.nextLine());
	        while (n-- != 0) {
	            String userName = scan.nextLine();

	            if (userName.matches(UsernameValidator.regularExpression)) {
	                System.out.println("Valid");
	            } else {
	                System.out.println("Invalid");
	            }           
	        }
	    }
	}