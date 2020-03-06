import java.util.*;
import java.lang.*;
import java.io.*;

class modDiceRoll
{
	public static void main (String[] args) throws java.lang.Exception
	{
		diceRoll();
	}
	public static void diceRoll() {
		int a = 0, b = 0, c = 0, count=0;
		Random rand = new Random();
		do {
		a = rand.nextInt(7) + 1;
		b = rand.nextInt(7) + 1;
		c = a+b;
		System.out.println(a + " + " + b + " = " + c);
		count++;
		} while ( c != 7 );
		System.out.println("You won after " + count  +" tries!");
	}
}
