import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CountingFactors
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int[] factorList = countFactors(24);
		
			for (int i=0; i < factorList.length;i++) {
				if(i == 0) {
					System.out.print(factorList[i]);
				}
				else if(i == factorList.length - 1) {
					System.out.print(" and " + factorList[i]);
				}
				else if (i+1 == factorList[i]) {
					System.out.print( ", " + factorList[i]);
				}
			}
				System.out.print(" are factors of " + factorList[factorList.length-1]);
		
	}
	public static int[] countFactors(int a) {
		int[] numberList = new int[a];
		for (int i = 1; i <= a; i++) {
			if (a % i  == 0 ) {
				numberList[i-1] = i;
			}
		}
	return numberList;
	}
}
