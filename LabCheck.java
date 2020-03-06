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
		//int randnum = 1000202;
		System.out.println("\nThe number " + randnum + " has " + checkZeros(randnum) + " zero(s) in it.");
	    System.out.println("\n--------------------------------");
		System.out.print("Mystery - Input the first number:");
		int firstnum = input.nextInt();
		
		System.out.print("\nMystery - Input the second number:");
		int secondnum = input.nextInt();
		
		System.out.println("\nThe numbers " + firstnum + " and " + secondnum + " have a shared factor of " + mystery(firstnum, secondnum));
		

	   System.out.println("\n--------------------------------");
	   
	   System.out.print("\nVowel Checker - Input your word:");
	   String testphrase = input.next();
	   System.out.println("\nThe String " + testphrase + " all vowel check is : " + isAllVowels(testphrase));
	    
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
	
	public static int mystery(int x, int y) 
	{
		while (x != 0 && y!=0) { // x & y != 0
			if (x < y) { // if x smaller than y, x is subtracted from y
				y -= x;
			} else {
				x -= y; // if x bigger than y, y is subtracted from x
			}
		}
		return x+y;
	}
	
	public static boolean isAllVowels(String phrase) {
	    String letter = "";
	    boolean vowel = true;
	    for(int i = 0; i < phrase.length();i++) {
	    letter = phrase.substring(i, i+1);
    	    if (!letter.equalsIgnoreCase("a") && !letter.equalsIgnoreCase("e") && !letter.equalsIgnoreCase("i") && !letter.equalsIgnoreCase("o") && !letter.equalsIgnoreCase("u")) {
    	        vowel = false;
    	    }
	    }
	    return vowel;
	}
}
