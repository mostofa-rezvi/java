package TaskExam;

import java.util.ArrayList;
import java.util.List;

public class Q8PrimeNumber {
  public static void main(String[] args) {

    // Question 8: Find Prime Numbers in a Range
    // Write a function findPrimes(start, end) that returns all prime numbers
    // between start and end.
    // Example Input: findPrimes(10, 20)
    // Expected Output: [11, 13, 17, 19]

    int start = 10, end = 20;
    List<Integer> primes = new ArrayList<>();

    for (int num = start; num <= end; num++) {
      boolean isPrime = num >= 2;
      for (int i = 2; i * i <= num && isPrime; i++) {
        if (num % i == 0) {
          isPrime = false;
        }
      }
      if (isPrime) {
        primes.add(num);
      }
    }
    System.out.println(primes);
  }
}
