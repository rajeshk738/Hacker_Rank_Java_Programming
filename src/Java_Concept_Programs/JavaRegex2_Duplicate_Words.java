package Java_Concept_Programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2_Duplicate_Words {
	
	public static void main(String[] args) {
		
		String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		Scanner scan = new Scanner(System.in);
		
		int noofsentences = scan.nextInt();  // int noofsentences = Integer.parseInt(scan.nextLine())
		scan.nextLine();
		
		while(noofsentences-- > 0)
		{
			String s = scan.nextLine();
			
			Matcher m = p.matcher(s);
			
			while (m.find()) {
                s = s.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(s);
			
		}
	
	}
	
}
