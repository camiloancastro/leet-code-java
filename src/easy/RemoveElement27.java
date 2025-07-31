package easy;


public class RemoveElement27 {

  public static void main(String[] args) {

    var nums = new int[] {0,1,2,2,3,0,4,2};
    var val = 2;

    System.out.println(removeElement(nums, val));

  }

  public static int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != val) {
        nums[i] = nums[j];
        i++;
      }
    }
    return i;
  }



}
