package TaskExam;

public class Q3FizzBuzz {
  public static void main(String[] args) {

    // Question 3: FizzBuzz
    // Write a function fizzBuzz(n) that prints numbers from 1 to n.
    // For multiples of 3, print "Fizz". For multiples of 5, print "Buzz".
    // For multiples of both, print "FizzBuzz".
    // Example Input: fizzBuzz(15)
    // Expected Output: 1, 2, Fizz, 4, Buzz, ..., FizzBuzz

    fizzBuzz(15);
  }

  public static void fizzBuzz (int n) {

    for (int i = 1; i < n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      }
      else if (i % 3 == 0) {
        System.out.println("Fizz");
      }
      else if (i % 5 == 0) {
        System.out.println("Buzz");
      }
      System.out.println(i);
    }
  }
}
