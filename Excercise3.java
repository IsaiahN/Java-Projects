/* 
* Author: Isaiah Nwukor
* Date: 8/29/18
*/

package labScanner;

import java.util.Scanner;

public class labScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  	  int num1, num2, sum;
		      
		      Scanner input = new Scanner(System.in);
		      
		      System.out.print("Input your first number:");
		      num1 = input.nextInt();
		      
		      System.out.print("Input your second number:");
		      num2 = input.nextInt();
		      
		      sum = num1 + num2;
		      
		      System.out.println("The sum of the two numbers " + num1 + " and " + num2 + " is " + sum);
		
	}

}

