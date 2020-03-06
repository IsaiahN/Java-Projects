import java.util.*;
import java.lang.*;
import java.io.*;
 
class loopDownTriangle
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int size = 10;
		printBar(size);
		printArrows(size);
	}
	public static void printArrows(int size) {
		for (int i = 0; i <= size; i++) { //10 lines
			for (int j = 0; j <= i; j++) {
				System.out.print(">");
			}
			for (int k = ((2*size) - i); k > i; k--) {
				System.out.print(" ");
			}
			for (int l = 0; l <= i; l++) {
				System.out.print("<");
			}
		System.out.println();
		}
	}
	public static void printBar(int size) {
		for (int i = 0; i < (2*size) + 2; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
}
