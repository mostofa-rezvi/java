package Gmail;

import java.util.Scanner;

public class CheckVowel {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter any word or name: ");
    String word = scanner.next().toUpperCase();

    if (word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O") || word.startsWith("U")) {
      System.out.println("This word start with Vowel.");
    }
    else {
      System.out.println("This word start with Consonent.");
    }
    
    scanner.close();
  }
}
