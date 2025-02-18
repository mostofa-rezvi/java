package TaskExam;

import java.util.Scanner;

public class Q5Palindrome {
  public static void main(String[] args) {

    // Question 5: Check for a Palindrome
    // Write a function isPalindrome(str) that checks if a string is a palindrome.
    // Example Input: isPalindrome("racecar")
    // Expected Output: true

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a Word: ");
    String palindrome = scanner.next();

    System.out.println(isPalindrome(palindrome));

    scanner.close();
  }

  public static boolean isPalindrome (String str) {
    String reversed = new StringBuilder(str).reverse().toString();

    return str.equals(reversed);
  }
}
