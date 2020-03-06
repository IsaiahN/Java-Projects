
/* Name of the class has to be "Main" only if the class is public. */
class NumPatternStarsSpacing
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		for(int i =0; i<=8; i++) {
				for(int k = i; k > 0; k--) {
					System.out.print(" ");
				}
			for (int j = 0; j <= i; j++) {
			
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
