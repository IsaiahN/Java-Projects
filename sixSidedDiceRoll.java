import java.util.*;
import java.lang.*;
import java.io.*;


class diceRoll
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count = 0, sum =0;
		for(count = 1; sum !=7; ++count) {
			int num1 = (int) Math.max(Math.min((Math.random() * 10), 6), 1);
			int num2 = (int) Math.max(Math.min((Math.random() * 10), 6), 1);
			sum = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + sum);
			if (sum == 7) {
				System.out.println("You won after "+ count + " tries!");
			}
			
		}
	}
	
	
}
