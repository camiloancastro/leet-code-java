package easy;

/**
 * https://leetcode.com/problems/palindrome-number/submissions/1707838522/
 * @Author Camilo Castro
 */

public class Palindrome9 {

  public static void main(String[] args) {

    System.out.println(isPalindrome(1221));

  }


  public static boolean isPalindrome(int x) {
    String num = Integer.toString(x);
    StringBuilder result = new StringBuilder(num).reverse();
    String reverseStr = result.toString();
    return reverseStr.equals(num);
  }

}
