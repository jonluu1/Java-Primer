public class methodsandscope {
  //Global Variable
  //Don't use global variable unless necessary . Using global variables allow
  //the passing of values w/in variables between different methods. Setting up
  //global vaiable is the same setting up inside methods. Rather setup the
  //variables outside the methods but in the class
  //String helloWorld = "Hello World!";

  public static void main(String[] args) {
    //This goodbye variable is a local variable and can only be accessed within
    //the scope of the current method, the main method. Trying to refrence this
    //variable within the printHello() method will only result in an error
    String goodbye = "Goodbye World!";

    //To call other methods, we 'call' the name of the method and any paramter
    //that we need to pass through
    printHello();

    //Here this method requires a single input of a String. Java will throw an
    //error is this occurs. We pair this method call with a print statment as
    //the printGoodbye method has a return statment which returns a String
    System.out.println(printGoodbye(goodbye));

    //Here is another method that requires two int as input
    System.out.println(doAdd(6, 9));
  }
  //This is a new method that we are creating called printHello. Like main it
  //has a return type of 'void' or no return type. Once the code in this other
  //method we can 'call' it by it method name, 'printHello()'
  public static void printHello() {
    System.out.println("Hello World!");
    //This was used to demonstrate that global varibales can be access within
    //the same class but not the different methods
    // System.out.println(helloWorld);
  }

  //Another method that requires the programmer to pass in a single input. The
  //input must be of type String and inside this new method will have the local
  //variable name of word. This method also has a return type, denoted by the
  //String keyword after public static. This means that this method MUST have a
  //return statment and the type of that return must be of the type String.
  public static String printGoodbye(String word) {
    return word;
    //Here I attempt to call goodbye, a variable local to the main method.
    //Calling goodbye here results in an error
    //System.out.println(goodbye)
  }

  //This method requires the passing of two inputs from the programmer that will
  //take the values of a and b respectivly. The return type here is int so the
  //result must be of type int.
  public static int doAdd(int a, int b) {
    return a + b;
  }
}
