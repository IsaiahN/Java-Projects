import java.util.*;
import java.lang.*;
import java.io.*;

class StringExplodingCharSubstring
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s1 = "hello";
		Method1(s1);
	}
	
	public static void Method1(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(i + ": " + s.charAt(i) + " " + s.substring(i + 1, s.length()));
			
		}
	}
}
