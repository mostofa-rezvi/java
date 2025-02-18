package TaskExam;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Q6DuplicateRemoveArray {
  public static void main(String[] args) {

    // Question 6: Remove Duplicates from an Array
    // Write a function removeDuplicates(arr) that removes duplicate values from an
    // array.
    // Example Input: removeDuplicates([1, 2, 2, 3, 4, 4, 5])
    // Expected Output: [1, 2, 3, 4, 5]

    int[] nums = { 1, 2, 2, 3, 4, 4, 5 };

    Set<Integer> set = new LinkedHashSet<>();
    for (int num : nums) {
      set.add(num);
    }

    int[] setArray = set.stream().mapToInt(Integer::intValue).toArray();
    System.out.println(Arrays.toString(setArray));
  }
}
