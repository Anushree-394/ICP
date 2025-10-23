package Day_11;
import java.util.*;
public class valid_paranthesis {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(""+isValid(s));
    }
    public static boolean isValid(String s) {
        // Stack to store opening brackets
        Stack<Character> stack = new Stack<>();
        // Loop through the characters in the string
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If the stack is empty or doesn't match, return false
                if (stack.isEmpty() || 
                   (c == ')' && stack.pop() != '(') || 
                   (c == '}' && stack.pop() != '{') || 
                   (c == ']' && stack.pop() != '[')) {
                    return false;
                }
            }
        }
        // Return true if the stack is empty
        return stack.isEmpty();
    }

}
