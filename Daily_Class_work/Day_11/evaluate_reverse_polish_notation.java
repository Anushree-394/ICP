package Day_11;
import java.util.*;
public class evaluate_reverse_polish_notation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        System.out.println(evalRPN(arr));

    }
     public static int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(func(tokens[i])){
                int b=Integer.parseInt(st.pop());
                int a=Integer.parseInt(st.pop());
                int res=0;
                if(tokens[i].equals("+")){
                    res=a+b;
                }
                else if(tokens[i].equals("-")){
                    res=a-b;
                }
                else if(tokens[i].equals("*")){
                    res=a*b;
                }
                else if(tokens[i].equals("/")){
                    res=a/b;
                }
                st.push(Integer.toString(res));
                
            }
            else{
                st.push(tokens[i]);
            }
        }
        return Integer.parseInt(st.peek());
    }
        public static boolean func(String str){
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                return true;
            }
            return false;
        }
    
}
