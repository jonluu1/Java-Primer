public class recursion1
{
	public static void main(String[] args)
	{
		int n = 5;

		System.out.println(reallyRecursion(n));
	}

	public static int reallyRecursion(int number)
	{
		//base case
		if (number <= 1)
		{
			return 1;
		}

		else
		{
			//number! = number * (number-1)!
			return number * reallyRecursion(number-1);
		}
	}
}