class PowersOf2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int n =0;
		int n2 = 0;
		int sum = 0;
		for(int i = 0; i<=6;i++) {
			n = (int) Math.pow(2, i);
			n2 = n+1;
			sum= n+n2;
			System.out.println(n + " + " + n2 +" = " + sum );
		}
	}
}
