import java.util.Arrays;

public class Question_04 {
  public static void main(String[] args) {
    int[] initialArray = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    int[] squaredArray = powArray(initialArray);
    System.out.println("Initial:: " + Arrays.toString(initialArray));
    Sysetm.out.println("Squared:: " + Arrays.toString(squaredArray));
  }

  public static int[] powArray(int[] a) {
    for (int i = 0; i < a.length; i++) {
      a[i] = (int)Math.pow(a[i], 2);
    }
    return a;
  }
}
