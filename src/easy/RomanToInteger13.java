package easy;

import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer/description/
 * @Author Camilo Castro
 */
public class RomanToInteger13 {

  private static final Map<Character,Integer> map = Map.of(
      'I',1,'V',5,'X',10,'L',50,
      'C',100,'D',500,'M',1000);


  public static void main(String[] args) {


    System.out.println(romanToInt("MCMXCIV"));

  }

  public static int romanToInt(String s) {

    int sum = 0;

    for (int i = 0; i < s.length() - 1; i++) {

      int actual = map.get(s.charAt(i));
      int siguiente = map.get(s.charAt(i + 1));

      if (actual < siguiente) {
        sum -= actual;
      } else {
        sum += actual;
      }

    }

    // Agrega el último valor ya que el for va hasta s.length() - 1, nunca lo toma
    sum += map.get(s.charAt(s.length() - 1));

    return sum;
  }


}
