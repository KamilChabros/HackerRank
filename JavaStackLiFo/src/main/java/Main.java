import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            System.out.println(isBalanced(scanner.next()));
        }
        scanner.close();
    }

    private static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < parentheses.length(); i++){
            char ch = parentheses.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{'){
//                push() adds ch on top of the stack
                stack.push(ch);
            } else if (stack.empty()){
                return false;
            } else {
//                pop() bring last item added to top of the stack
                char top = stack.pop();
                if ((top == '(' && ch != ')') || (top == '[' && ch != ']') || (top == '{' && ch != '}')){
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
