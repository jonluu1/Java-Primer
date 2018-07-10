public class methodsandscope {
  public static void main(String[] args) {
    String goodbye = "Goodbye World!";
    printHello();
    System.out.println(printGoodbye(goodbye));
    printHello();
    System.out.println(doAdd(6, 9));
  }

  public static void printHello() {
    System.out.println("Hello World!");
  }

  public static String printGoodbye(String word) {
    return word;
  }

  public static int doAdd(int a, int b) {
    return a + b;
  }
}
