package TaskExam;

public class Q1Reverse {

  public static void main(String[] args) {

    // Question 1: Reverse a String
    // Write a function reverseString(str) that takes a string and returns it
    // reversed.
    // Example Input: reverseString("hello")
    // Expected Output: "olleh"

    // Single Method
    // String reverseString = "Hello";
    // System.out.println(new StringBuilder(reverseString).reverse().toString());

    // Double Methods
    System.out.println(reverseString("Rezvi"));
  }

  public static String reverseString (String reverseString) {
    return new StringBuilder(reverseString).reverse().toString();
  }
}