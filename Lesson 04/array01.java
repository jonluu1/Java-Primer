import java.util.Arrays;
public class array01 {
  public static void main(String[] args) {
    int size = 4;
    //Creating arrays normally and setting the size later
    int[] arrayOfInt;
    arrayOfInt = new int[4];
    double[] arrayOfDouble;
    arrayOfDouble = new double[size];
    //Doing it all at once
    String[] arrayOfString = new String[4];
    //Setting the elements to values
    arrayOfInt[0] = 1;
    arrayOfInt[1] = 2;
    arrayOfInt[2] = 3;
    arrayOfInt[3] = 4;
    //NOTE that the size is 4 but the index for the last element is 3 since the
    //index starts at 0

    //Print out the array
    //arrayPrinter(arrayOfInt);
    String intArrayF = arrayPrintF(arrayOfInt);
    System.out.println(intArrayF);

    //Giving values to arrayOfDouble
    for (int i = 0; i < arrayOfDouble.length; i++) {
      arrayOfDouble[i] = (i + 1) * 1.5;
    }
    //Printing out arrayOfDouble using an overloaded arrayPrintF
    System.out.println(arrayPrintF(arrayOfDouble));

    //Using java.util.Arrays
    System.out.println(Arrays.toString(arrayOfInt));
    System.out.println(Arrays.toString(arrayOfDouble));
  }

  //A method to print the array
  public static void arrayPrinter(int[] intArray) {
    //For loop are one of the best ways to access arrays as they start at 0 and
    //end before the end of the array
    for (int i = 0; i < 4; i++) {
      System.out.println(intArray[i]);
    }
  }

  //A method to format the array before it is printed
  public static String arrayPrintF(int[] intArray) {
    //Create a local accumulator
    String output = "[" + intArray[0];
    //Here we start at 1 since we already added the first element to our output
    //we then use a method of arrays called length that return the length of the
    //array. We can use this since the the length of the array is 4 and the for
    //loop will only allow i to go to 3
    for (int i = 1; i < intArray.length; i++) {
      output +=  ", " + intArray[i];
    }
    return output + "]";
  }

  //Overloading arrayPrintF for double[]
  public static String arrayPrintF(double[] doubleArray) {
    //Create a local accumulator
    String output = "[" + doubleArray[0];
    for (int i = 1; i < doubleArray.length; i++) {
      output +=  ", " + doubleArray[i];
    }
    return output + "]";
  }
}
