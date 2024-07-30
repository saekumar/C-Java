package Tutorial1.stacks;

import java.util.*;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(changeInfixToPostfix(s));
        sc.close();
    }

private static String changeInfixToPostfix(String s) {

        String resStr = "";
        Stack<Character> stk = new Stack<>();
        HashMap<Character, Integer> hash = new HashMap<>();

        hash.put('+', 1);
        hash.put('-', 1);
        hash.put('*', 2);
        hash.put('/', 2);
        hash.put('^', 3);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch == '+') || (ch == '-') || (ch == '*') || (ch == '/') || (ch == '^')) {
                while (!stk.isEmpty() && stk.peek() != '(' && hash.get(stk.peek()) >= hash.get(ch)) {
                    resStr += stk.pop();
                }
                stk.push(ch);
            } else if (ch == '(') {
                stk.push(ch);
            } else if (ch == ')') {
                while (!stk.isEmpty() && stk.peek() != '(') {
                    resStr += stk.pop();
                }
                if (!stk.isEmpty() && stk.peek() == '(') {
                    stk.pop();
                }
            } else {
                resStr += ch;
            }
        }
        while (!stk.isEmpty()) {
            resStr += stk.pop();
        }

        return resStr;
    }
}
