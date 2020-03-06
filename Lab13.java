import java.util.*;
import java.lang.*;
import java.io.*;

class Lab13
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Random rand = new Random();
		int a = rand.nextInt(9000) + 1000;
		int b = rand.nextInt(10);
		System.out.println("My name is \"Isaiah Nwukor\", and "+ a +" contains " + b + ": " + containDigit(a,b) );
	}
	
	public static boolean containDigit(int a, int b) {
		//assume that a is positive integer
		//b is 0-9
		do {
			if ((a % 10) == b) {
				return true;
			}
			a /= 10;
		} while (a >= 1);
		return false;
	}
}
