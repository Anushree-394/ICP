package Assignment_10;
import java.util.*;
public class Implement_Queue_using_stack {
    public static void main(String[] args){

    }
    
}
class MyQueue {
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> st2=new Stack<>();
    
    
    public void push(int x) {
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        st1.push(x);
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }

    }
    
    public int pop() {
        return st2.pop();
    }
    
    public int peek() {
        return st2.peek();
    }
    
    public boolean empty() {
        return st2.isEmpty();
    }
}

