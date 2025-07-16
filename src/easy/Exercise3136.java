package easy;

/**
 * A word is considered valid if:
 * <p>
 * It contains a minimum of 3 characters. It contains only digits (0-9), and English letters
 * (uppercase and lowercase). It includes at least one vowel. It includes at least one consonant.
 */


public class Exercise3136 {

  private static final String VOWELS = "aeiouAEIOU";

  public static void main(String[] args) {
    var isValid = isValid("234Adas");
    //var isValid = isValid("a3$e");
    System.out.println(isValid);

  }


  public static boolean isValid(String word) {

    if (word.length() < 3) {
      return   false;
    }

    int vowelCount = 0;
    int numberCount = 0;

    for (char c : word.toCharArray()) {

      if (Character.isDigit(c))
        continue;

      if (Character.isLetter(c)) {

        if (VOWELS.indexOf(c) >= 0) {
          ++vowelCount;
        }  else {
          ++numberCount;
        }

      } else {
        return false;
      }

    }

    return vowelCount > 0 && numberCount > 0;

  }

}
