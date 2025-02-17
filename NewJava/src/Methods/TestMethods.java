package Methods;

public class TestMethods {
  public static void main(String[] args) {
    System.out.println(doSum(15.00, 10));
  }

  static int doSum (double numOne, double numTwo) {
    int result = (int) (numOne + numTwo);
    return result;
  }
}
