import java.util.*;
import java.lang.*;
import java.io.*;


class ArrayProblems
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr1 = {6,2,9,11,3};
		
		System.out.println("Percent Even Function:");
		System.out.println(percentEven(arr1));
		System.out.println("\nAppend Function: ");
		int[] list1 = {2,4,6};
		int[] list2 = {1,2,3,4,5};
		System.out.println(Arrays.toString(append(list1,list2)));
	}
	
	public static double percentEven (int[] numbers)
	{
		double percent = 0.0;
		
		for(int i = 0; i < numbers.length;i++) {
			if (numbers[i] % 2 == 0) {
				percent++;
			}
		}
		
		if (percent > 0) {
			percent = ((percent /numbers.length) * 100) ;
		}
		return percent;
	}
	
	public static int[] append(int[] arr1, int[] arr2) {
		int i;
		int[] newarr = new int[arr1.length + arr2.length];
		for (i = 0; i < arr1.length; i++) {
			newarr[i] = arr1[i]; 
		}
		for (int j = 0; j < arr2.length ; j++) {
			newarr[j+i] = arr2[j]; 
		}
		return newarr;
	}
}
