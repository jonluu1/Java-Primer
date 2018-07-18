import java.util.Scanner;

public class Question_03 {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter a height:: ");
    int num = userInput.nextInt();
    pyramid(num);
  }
  public static void pyramid(int num) {
    for (int i = 1; i <= num; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
