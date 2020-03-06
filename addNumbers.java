// Add Numbers 1 through five.
class addNumbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int total = 0;
		for (int i=1;i <=5; i++) {
			System.out.print(i + "+");
			total += i;
		}
		System.out.print("=" + total);
	}
}
