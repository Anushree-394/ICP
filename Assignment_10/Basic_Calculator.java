package Assignment_10;
import java.util.*;
public class Basic_Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(calculate(s));


    }
    public static int calculate(String s) {
        int curr=0;
        char op='+'; 
        Stack<Integer> st=new Stack<>();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i])){
                curr=curr*10+arr[i]-'0'; // to handle multiple digits cases
            }

            if((!Character.isDigit(arr[i]) && arr[i]!=' ' ) || i==arr.length-1){
                if(op=='+'){
                    st.push(curr);
                }
                else if(op=='-'){
                    st.push(-curr);
                }
                else if(op=='*'){
                    st.push(curr*st.pop());
                }
                else if(op=='/'){
                    st.push(st.pop()/curr);
                }
                op=arr[i];
                curr=0;
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}
