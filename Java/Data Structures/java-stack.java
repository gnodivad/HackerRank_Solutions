import java.util.*;

class Solution {

    private static boolean isBalance(String input) {
        Stack<String> stack = new Stack();

        for (int i = 0; i < input.length(); i++) {
            String element = input.substring(i, i + 1);

            if (element.equals("{") || element.equals("(") || element.equals("[")) {
                stack.push(element);
            } else {
                String topElement = "";
                try {
                    topElement = stack.peek();
                } catch (EmptyStackException e) {
                    return false;
                }

                if (element.equals("}") && topElement.equals("{")) {
                    stack.pop();
                } else if (element.equals(")") && topElement.equals("(")) {
                    stack.pop();
                } else if (element.equals("]") && topElement.equals("[")) {
                    stack.pop();
                }
            }
        }

        return stack.size() == 0;
    }

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();

            System.out.println(isBalance(input) ? "true" : "false");
        }
    }
}
