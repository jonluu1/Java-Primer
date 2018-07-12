public class methodsAndScope0
{
	public static void main(String[] args)
	{
		int number = 5;

		int multiplier = 10;

		multN(number, multiplier);
		
		System.out.println(number);
	}

	public void multN(int number, int multiplier)
	{
		 number  = number * multiplier;
	}
}