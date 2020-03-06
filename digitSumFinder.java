import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.print(digitSum(29107));
	}
	
	public static int digitSum(int num) {
		int sum;
		for (sum = 0; num >=1; num /= 10){
			if(sum == 0) {
				System.out.print(num % 10);
			} else {
				System.out.print( " + " + num % 10);
			}
			sum += num % 10;
		}
		System.out.print(" or ");
		return sum;
	}
}
