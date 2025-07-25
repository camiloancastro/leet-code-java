package easy;

import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class ValidParentheses20 {

  private static Map<Character, Character> mapa = Map.of(
      ')', '(',
      ']', '[',
      '}', '{'
  );

  public static void main(String[] args) {

    System.out.println(isValid("(]"));

  }

  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
      if (mapa.containsKey(c)) {
        if (stack.isEmpty() || !Objects.equals(stack.peek(), mapa.get(c))) {
          return false;
        }
        stack.pop();
      } else {
        stack.push(c);
      }
    }

    return stack.isEmpty();

  }

}
