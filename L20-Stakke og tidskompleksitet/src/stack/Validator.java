package stack;

public class Validator {
    static boolean validateBrackets(String expression) {
        StackI stack = new NodeStack();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }else if(ch == ')' || ch == ']' || ch == '}') {
                if(stack.isEmpty()) return false;
                char pop = (Character) stack.pop();
                if(!(pop == '(' && ch == ')' || pop == '[' && ch == ']' || pop == '{' && ch == '}')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
