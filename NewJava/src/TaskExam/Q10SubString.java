package TaskExam;

import java.util.HashSet;
import java.util.Set;

public class Q10SubString {
  public static void main(String[] args) {

    // Question 10: Find the Longest Substring Without Repeating Characters
    // Write a function longestSubstring(s) to find the length of the longest
    // substring
    // without repeating characters.
    // Example Input: longestSubstring("abcabcbb")
    // Expected Output: 3

    String s = "abcabcbb";
    Set<Character> seen = new HashSet<>();
    int maxLength = 0, left = 0;

    for (int right = 0; right < s.length(); right++) {
      while (seen.contains(s.charAt(right))) {
        seen.remove(s.charAt(left++));
      }
      seen.add(s.charAt(right));
      maxLength = Math.max(maxLength, right - left + 1);
    }

    System.out.println(maxLength);
  }
}
