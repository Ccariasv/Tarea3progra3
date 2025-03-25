package ValidacionParentesis;

import java.util.Stack;

public class ValidacionParentesis {
    public static boolean esBalanceado(String s) {
        Stack<Character> pila = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) {
                    return false;
                }

                char apertura = pila.pop();
                if ((c == ')' && apertura != '(') ||
                        (c == ']' && apertura != '[') ||
                        (c == '}' && apertura != '{')) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }
}
