//Dindo T. Tenoria



import java.util.Scanner;
import java.util.Stack;

public class infixtopostfix {
    static private String expression;
    private Stack<Character> stk = new Stack<Character>();

    public infixtopostfix(String infixExpression) {
        expression = infixExpression;
    }

    public String infixToPostfix() {
        String postfixString = "";

        for (int i = 0; i < expression.length(); ++i) {
            char value = expression.charAt(i);
            if (value == '(') {

            } else if (value == ')') {
                Character oper = stk.peek();

                while (!(oper.equals('(')) && !(stk.isEmpty())) {
                    stk.pop();
                    postfixString += oper.charValue();

                }
            } else if (value == '+' || value == '-') {
                if (stk.isEmpty()) {
                    stk.push(value);
                } else {
                    Character oper = stk.peek();
                    while (!(stk.isEmpty() || oper.equals(('(')) || oper.equals((')')))) {
                        stk.pop();
                        postfixString += oper.charValue();
                    }
                    stk.push(value);
                }
            } else if (value == '*' || value == '/') {
                if (stk.isEmpty()) {
                    stk.push(value);
                } else {
                    Character oper = stk.peek();
                    while (!oper.equals(('+')) && !oper.equals(('-')) && !stk.isEmpty()) {
                        stk.pop();
                        postfixString += oper.charValue();
                    }
                    stk.push(value);
                }
            } else {
                postfixString += value;
            }
        }

        while (!stk.isEmpty()) {
            Character oper = stk.peek();
            if (!oper.equals(('('))) {
                stk.pop();
                postfixString += oper.charValue();
            }
        }
        return postfixString;
    }

    public static void main(String[] args) {
        System.out.println("Write an expression ");
        Scanner input = new Scanner(System.in);
        String expression = input.next();
        infixtopostfix convert = new infixtopostfix(expression);
        System.out.println("Postfix expression is in this form: \n" + convert.infixToPostfix());
    }
}