import java.util.Scanner;

public class whileLoops2
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);

		int c = userInput.nextInt();

		while ( c < 0 )
		{
			System.out.print("Invalid Input, Please Retry: ");

			c = userInput.nextInt();

			System.out.println();
		}

		System.out.println("Thank you for giving a positive integer");
	}
}