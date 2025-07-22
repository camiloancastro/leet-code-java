package easy;

/**
 * @Author Camilo Castro
 * Exercise: 1. Two Sum
 * Leetcode
 */

public class TwoSum2 {

  public static void main(String[] args) {
    int[] nums = new int[]{3, 3};
    int target = 6;

    System.out.println(twoSum(nums, target));


  }

  public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] {i, j};
        }
      }
    }
    return new int[0];
  }

}
