public Question_03 {
  public static void main(String[] args) {
    int[] randIntArray = new int[5];
    for (int i = 0; i < randIntArray.length; i++) {
    randIntArray[i] = 1 + (int)(Math.random() * 1000);
    }
    System.out.println("The index of the max element is:: " + indexOfMax(randIntArray));
  }

  public static int indexOfMax(int[] a) {
    int index = 0;
    for (int i = 1; i < a.lenght; i++) {
      if (a[index] < a[i]) {
        index = i;
      }
    }
    return index;
  }
}
