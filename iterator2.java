/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class lineNIterator2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n = 7;
		for( int line = 1; line <=n; line++) {
			for (int j = 1; j<= (-1 * line + n); j++) {
				System.out.print(" ");
			}
		
			System.out.print(line);
			
				for (int j=0;j < (2 * line - 1);j++) {
				System.out.print(" ");
			}
			System.out.println(line);
			
		}
	}
}
