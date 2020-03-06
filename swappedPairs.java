

import java.util.*;
import java.lang.*;
import java.io.*;

class textPairSwap
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the text that you would like to swap:\n");
		String title = input.nextLine();
		System.out.println(swapPairs(title));
	}
	
	public static String swapPairs(String word) {
		String swappedWord = "";
		for(int i = 0; i < word.length(); i+=1)
		{
			if(i != word.length() - 1) {
				swappedWord	= swappedWord + word.substring(i+2, i+3) + word.substring(i+1, i+2);
			}
			else {
				swappedWord = swappedWord + word.substring(i+2);
			}
		}
		
		return swappedWord;
	}
}
