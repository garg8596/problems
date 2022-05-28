import java.util.Stack;

public class EvaluateExp {
    public int evalRPN(String[] A) {
        Stack<String> stack = new Stack<>();
        int first = 0;
        int second = 0;

        for(String str:A)
        {
            if(str.equalsIgnoreCase("+"))
            {
                second = Integer.parseInt(stack.pop());
                first = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(first+second));
            }
            else if(str.equalsIgnoreCase("*"))
            {
                second = Integer.parseInt(stack.pop());
                first = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(first*second));
            }
            else if(str.equalsIgnoreCase("/"))
            {
                second = Integer.parseInt(stack.pop());
                first = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(first/second));
            }
            else if(str.equalsIgnoreCase("-"))
            {
                second = Integer.parseInt(stack.pop());
                first = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(first-second));
            }
            else 
            {
                stack.push(str);
            }
        }

        return Integer.valueOf(stack.peek());
    }

    public static void main(String[] args) {
        String[] A = {"5", "1", "2", "+", "4", "*", "+", "3", "-"};
        System.out.println(new EvaluateExp().evalRPN(A)); 
    }
}
