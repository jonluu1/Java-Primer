public class recursion0
{
	public static void main(String[] args)
	{
		int n = 5;

		//calculates the factorial
		System.out.println(notReallyRecursion(n));
	}

	public static void notReallyRecursion(int number)
	{
		int factorial = 1;
		for ( int i = number; i > 0; i--)
		{
			factorial *= number;
		}
		//5! = 5 * 4 * 3 * 2 * 1
		return factorial;
	}
}