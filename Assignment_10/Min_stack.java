package Assignment_10;

import java.util.Stack;

public class Min_stack {
    public static void main(String[] args){
        

    }
}
class MinStack {
    Stack<Integer> st=new Stack<>();
    int min=Integer.MAX_VALUE;

   
    
    public void push(int val) {
        if(val<=min){
            st.push(min);
            min=val;
        }
        st.push(val);

    }
    
    public void pop() {
        if(st.pop()==min){
            min=st.pop();

        }
    }
    
    public int top() {
       return st.peek();
        
    }
    
    public int getMin() {
        return min;
    }
}
    

