/*
Sample Input:

Hello world
I am a file
Read me until end-of-file.


Sample Output:

1 Hello world
2 I am a file
3 Read me until end-of-file.


this a end of file program .... read until end of file.
*/

package Java_Concept_Programs;
import java.io.*;
import java.util.*;

public class End_of_file {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int count = 1;
      while(scan.hasNext())
      {
    	  System.out.println(count+" "+scan.nextLine());
    	  count++;
          
      }


    }
}