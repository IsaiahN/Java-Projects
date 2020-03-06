/* Name of the class has to be "Main" only if the class is public. */
class NumPatternStars
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		for(int i =9; i>=0; i--) {
			
			for (int j =i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
