package methods;

public class MethodOverloading {
  public static void main(String args[]) {
    System.out.println(timesTwo(2.5)); // 5.0 (double)
    System.out.println(timesTwo(2)); // 4   (int)
  }

  static int timesTwo(int x) {
    return x * 2;
  }

  static double timesTwo(double x) {
    return x * 2;
  }
}

/*
 * Yes, both methods have the exact same name - but they expect and return different datatypes. When calling the method, Java will automatically chose the method with the fitting datatype.
 */
