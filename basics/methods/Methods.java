package methods;

public class Methods {
  // Basic method
  static int timesTwo(int x) {
    return x * 2;
  }

  public static void main(String args[]) {
    System.out.println(timesTwo(2)); // 4
  }
}


// ----------------------------------------------------
/*
* - A method must be defined within a Class. With the static keyword we define that the    method belongs to the class it is wrapped by. Void means, it does not return something. We need to define the datatype of the parameters and the return-value.
*/