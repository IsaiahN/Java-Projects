
    import java.util.*;
    import java.lang.*;
    import java.io.*;
     
    class SingleParameter
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    		int x = 17;
    		doubleNumber(x);
    		System.out.println("x = " + x);
    		System.out.println();
     
    		int number = 42;
    		doubleNumber(number);
    		System.out.println("number = " + number);
    	}
     
    	public static void doubleNumber(int number) {
    		System.out.println("Initial value = " + number);
    		number *= 2;
    		System.out.println("Final value = " + number);
    	}
    }
