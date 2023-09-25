package methods;

public class MultipleParameters {
  public static void main(String args[]) {
    System.out.println(add(2, 3));
  }

  static int add(int x, int y) {
    return x + y;
  }
}
/*
 * Of course, we can also pass multiple parameters into a method in Java. But there is no shorthand-syntax for it, so we need to write the datatype of each parameter.
 */
