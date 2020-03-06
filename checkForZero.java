import java.util.*;
import java.lang.*;
import java.io.*;

public class checkForZero
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Zero Checker - Input Your Number:");
		int randnum = input.nextInt();
		System.out.println("\nThe number " + randnum + " has " + checkZeros(randnum) + " zero(s) in it.");
	}
	public static int checkZeros(int number) {
		int count = 0;
		do {
			if (number % 10 == 0) {
				count++;
			}
			number /= 10;
		} while (number > 0);
		return count;
	}
}
