import java.util.*;
import java.lang.*;
import java.io.*;

class bitPatternMultiples
{
	public static void main (String[] args) throws java.lang.Exception
	{
		bitMultiple(5, 100);
	}
	public static void bitMultiple(int a, int b) {
		for (int i = a; i <= b; i +=5) {
			System.out.print("bit pattern representation of " + i + " is ");
			
			
			int count = i;
			for (int j = i; j >= 0; j--) {
				
			 	//System.out.println((int) Math.pow(2,j) + " <= " + i);
			 if ((int) Math.pow(2,j) <= i) {
			 	if(count - (int) Math.pow(2,j) >=0) {
			 		System.out.print("1");
			 		count -= (int) Math.pow(2,j);
			 	}
			 	else { 
			 		System.out.print("0");
				} 
			 }
			}
			System.out.println(".");
		}
	}
}
