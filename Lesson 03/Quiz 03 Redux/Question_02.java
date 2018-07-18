import java.util.Scanner;

public class Question_02 {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter a base number:: ");
    int num = userInput.nextInt();
    multiTable(num);
  }

  public static void multiTable(int num) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i * num);
    }
  }
}
