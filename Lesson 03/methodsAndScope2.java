public class methodsAndScope2
{
	public static void main(String[] args)
	{
		int number = 5;

		int multiplier = 10;

		number = multN(number, multiplier);

		System.out.println(number);
	}

	public static int multN(int n, int mult)
	{
		 return n * mult;
	}
}