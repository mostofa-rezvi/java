package TaskExam;

import java.util.ArrayList;
import java.util.List;

public class Q7NestedArray {
  public static void main(String[] args) {

    // Question 7: Flatten a Nested Array
    // Write a function flatten(arr) that flattens a nested array.
    // Example Input: flatten([1, [2, [3, [4]], 5]])
    // Expected Output: [1, 2, 3, 4, 5]

    List<Object> nestedList = List.of(1, List.of(2, List.of(3, List.of(4)), 5));
    List<Integer> flatList = new ArrayList<>();

    // new Object() { // Anonymous class to hold the recursive method
    //   void flatten(List<Object> list) {
    //     for (Object item : list) {
    //       if (item instanceof List) {
    //         flatten((List<Object>) item);
    //       } else {
    //         flatList.add((Integer) item);
    //       }
    //     }
    //   }
    // }.flatten(nestedList);

    // System.out.println(flatList);

    flatten(nestedList, flatList);

    System.out.println(flatList);
  }

  private static void flatten(List<Object> list, List<Integer> flatList) {
    for (Object item : list) {
      if (item instanceof List) {
        flatten((List<Object>) item, flatList);
      } else {
        flatList.add((Integer) item);
      }
    }
  }
}
