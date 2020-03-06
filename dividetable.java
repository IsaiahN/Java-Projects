/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DivideTable2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int n =2820;
		int n2 = 0;
		int sum = 0;
		for(int i = 8; i>0;i--) {
			n /= 3;
			n2 = n+1;
			sum= n+n2;
			System.out.println(n + " + " + n2 +" = " + sum );
		}
	}
}
