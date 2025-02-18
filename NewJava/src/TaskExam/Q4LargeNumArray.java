package TaskExam;

public class Q4LargeNumArray {
  public static void main(String[] args) {

    // Question 4: Find the Largest Number in an Array
    // Write a function findLargest(arr) that returns the largest number in an
    // array.
    // Example Input: findLargest([1, 5, 3, 9, 2])
    // Expected Output: 9


    // int[] numbers = {1, 5, 3, 9, 2};

    // int maxNum = numbers[0];
    // for (int num : numbers) {
    //   if (num > maxNum) {
    //     maxNum = num;
    //   }
    // }

    // System.out.println(maxNum);

    int[] numbers = {1,5,3,9,2};
    System.out.println(findLargest(numbers));
  }

  public static int findLargest(int[] num) {
    int maxNum = num[0];

    for (int arr : num) {
      if (arr > maxNum) {
        maxNum = arr;
      }
    }
    return maxNum;
  }
}
