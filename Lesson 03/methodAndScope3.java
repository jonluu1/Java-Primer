public class methodsAndScope3
{
	//class scope - global variable
	int number;

	public static void main(String[] args)
	{
		number = 5;

		//method scope - local variable
		int multiplier = 10;

		multN(multiplier);

		System.out.println(number);
	}

	public static void multN(int mult)
	{
		 number *= mult;
	}
}