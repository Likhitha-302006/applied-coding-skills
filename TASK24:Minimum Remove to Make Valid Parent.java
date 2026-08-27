Minimum Remove to Make Valid Parentheses
Java Code
import java.util.*;


class Main {
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";


        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        boolean[] remove = new boolean[s.length()];


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);


            if (c == '(') {
                stack.push(i);
            } 
            else if (c == ')') {
                if (stack.isEmpty())
                    remove[i] = true;
                else
                    stack.pop();
            }
        }


        while (!stack.isEmpty())
            remove[stack.pop()] = true;


        for (int i = 0; i < s.length(); i++) {
            if (!remove[i])
                result.append(s.charAt(i));
        }


        System.out.println(result);
    }
}

Input:

lee(t(c)o)de)

Output:

lee(t(c)o)de
