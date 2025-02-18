package TaskExam;

public class Q2OddEven {
  public static void main(String[] args) {

    // Question 2: Check if a Number is Even or Odd
    // Write a function isEven(num) that checks if a number is even.
    // Example Input: isEven(4)
    // Expected Output: true

    System.out.println(isEven(7));
    System.out.println(isEven(4));
  }

  public static boolean isEven (int num) {
    return num % 2 == 0;
  }
}
