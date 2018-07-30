import java.util.Scanner;
import java.util.Arrays;

public class Question_02 {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.print("How large do you want the array:: ");
    int size = userInput.nextInt();
    int[] intArray = new int[size];
    String[] stringArray = new String[size];

    for (int i = 0; i < size; i++) {
      System.out.print("Enter int #" + (i + 1) + ":: ");
      intArray[i] = userInput.nextInt();
	  userInput.nextLine();
      System.out.print("Enter string #" + (i + 1) + ":: ");
      stringArray[i] = userInput.nextLine();
    }
    arrayPrintf(intArray, stringArray);
  }

  public static void arrayPrintf(int[] aI, String[] aS) {
    for (int i = 0; i < aI.length; i++) {
      System.out.println(aI[i] + " " + aS[i]);
    }
  }
}
