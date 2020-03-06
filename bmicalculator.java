import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;


class bmiCalculator
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter next person's information:");
		System.out.print("height (in inches)? ");
		double height = input.nextDouble();
		System.out.print("\nweight (in pounds)? ");
		double weight = input.nextDouble();
		System.out.println(bmiCalc(weight, height));
	}
	
	public static String bmiCalc(double weight, double height) {
	
		double answer = ((weight / Math.pow(height, 2)) * 703);
		System.out.println("\nBMI = " + answer);
		if (answer >= 30) {
			return "obese";	
		} 
		else if (answer >= 25 && answer <= 29.9) {
			return "overweight";	
		}
		else if (answer >= 18.5 && answer <= 24.9) {
			return "normal";	
		}
		else if (answer < 18.5) {
			return "underweight";	
		}
		return "error";
	}
	
}
