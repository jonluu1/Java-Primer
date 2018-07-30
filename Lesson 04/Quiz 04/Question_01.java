import java.util.Arrays;

public class Question_01 {
  public static void main(String[] args) {
      int[] randIntArray = new int[5];
      for (int i = 0; i < randIntArray.length; i++) {
        randIntArray[i] = 1 + (int)(Math.random() * 1000);
      }
      System.out.println(Arrays.toString(randIntArray));
  }
}
