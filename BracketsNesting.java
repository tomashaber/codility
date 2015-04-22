import java.util.Stack;

/**
 * @author Tomas Haber
 * @since 8.4.2015
 */
public class BracketsNesting {
    public static int solution(String S) {
        if (S.length() == 0) {
            return 1;
        }
        Stack<Character> stack = new Stack<>();

        char[] s = S.toCharArray();

        for (char c : s) {
            if (c == '(') {
                stack.push(c);
            }
            if (c == '{') {
                stack.push(c);
            }
            if (c == '[') {
                stack.push(c);
            }

            if (c == ')') {
                Character popped = stack.pop();
                if (popped != '(') {
                    return 0;
                }
            }

            if (c == '}') {
                Character popped = stack.pop();
                if (popped != '{') {
                    return 0;
                }
            }

            if (c == ']') {
                Character popped = stack.pop();
                if (popped != '[') {
                    return 0;
                }
            }
        }

        if (!stack.isEmpty()) {
            return 0;
        }

        return 1;
    }
}
