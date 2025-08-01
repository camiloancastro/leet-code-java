package easy;

public class FindTheIndexOfTheFirstOcurrence28 {

  public static void main(String[] args) {

    System.out.println(strStr("leetcode", "leeto"));

  }

  public static int strStr(String haystack, String needle) {


    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
      boolean found = true;

      for (int j = 0; j < needle.length(); j++) {
        if (haystack.charAt(i + j) != needle.charAt(j)) {
          found = false;
          break;
        }
      }

      if (found) {
        return i;
      }
    }

    return -1;
  }

}
