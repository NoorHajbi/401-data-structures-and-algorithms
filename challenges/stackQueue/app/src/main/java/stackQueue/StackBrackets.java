package stackQueue;

import java.util.Stack;

public class StackBrackets {
    //Code Challenge 13
    private static boolean checkPairs(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }

    public static boolean validateBrackets(String exp) {
        Stack<Character> stack = new Stack<>();
        if (exp.length() == 0) {
            return false;
        }
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(' || exp.charAt(i) == '{' || exp.charAt(i) == '[')
                stack.push(exp.charAt(i));
            else if (exp.charAt(i) == ')' || exp.charAt(i) == '}' || exp.charAt(i) == ']') {
                if (stack.isEmpty() || !checkPairs(stack.peek(), exp.charAt(i)))
                    return false;
                else
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }

}
