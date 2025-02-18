package TaskExam;

import java.util.HashMap;
import java.util.Map;

public class Q9CountFrequency {
  public static void main(String[] args) {

    // Question 9: Count the Frequency of Each Character in a String
    // Write a function countCharacterFrequency(str) that takes a string
    // and returns an object with the frequency of each character in the string.
    // Ignore spaces.
    // Example Input: countCharacterFrequency("hello world")
    // Expected Output: { h: 1, e: 1, l: 3, o: 2, w: 1, r: 1, d: 1 }

    String str = "hello world";
    Map<Character, Integer> frequencyMap = new HashMap<>();

    for (char ch : str.replace(" ", "").toCharArray()) {
      frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
    }

    System.out.println(frequencyMap); // Output: {h=1, e=1, l=3, o=2, w=1, r=1, d=1}
  }
}
