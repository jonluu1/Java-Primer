public class methodsAndScope0
{
	public static void main(String[] args)
	{
		
		int number = 5;

		int multiplier = 10;

		multN(number, multiplier);

		multN(6,10);

		System.out.println(number);
	}

	public static  void multN(int n, int mult)
	{
		 n  = n * mult;
	}
}