/*
 * Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:

1. The name of the start and end tags must be same. 
    The HTML code <h1>Hello World</h2> is not valid, because the text starts with an h1 tag and 
    ends with a non-matching h2 tag.

2. Tags can be nested, but content between nested tags is considered not valid. 
    For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.

3. Tags can consist of any printable characters.

Sample Input

4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>
Sample Output

Nayeem loves counseling
Sanjay has no watch
So wait for a while
None
Imtiaz has a secret crush
 */

package Java_Concept_Programs;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tag_Content_Extractor{
	public static void main(String[] args){
		Scanner scan  = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        while (testCases-- > 0) {
            String line = scan.nextLine();
            boolean matchFound = false;
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);
            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if (!matchFound) {
                System.out.println("None");
            }
        }
        scan.close();
        
        }
    }

