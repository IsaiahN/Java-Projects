import java.util.*;
import java.lang.*;
import java.io.*;

class hypotenuseNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		double csqr =  hypoCalc(5, 10);
		System.out.println("The Hypotenuse is " + csqr);
	}
	
	public static double hypoCalc (double a, double b) {
		return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
	}
}
