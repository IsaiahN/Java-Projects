    import java.util.*;
    import java.lang.*;
    import java.io.*;
     
    /* Name of the class has to be "Main" only if the class is public. */
    class RapperName
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    	   Scanner input = new Scanner(System.in);
    		System.out.print("Type your name, playa: ");
    	   String name = input.nextLine();
    	   System.out.println();
    	   int space = name.indexOf(" ") + 1;
     
    	   System.out.print("Your gangsta name is " + "\"" + name.charAt(0) + ". Diddy "  + name.substring(space).toUpperCase() + " " + name.substring(0,space -1)  + "-izzle" +  "\"");
    	}
    }
