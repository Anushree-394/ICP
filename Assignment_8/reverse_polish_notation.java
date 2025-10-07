package Assignment_8;
import java.util.*;
public class reverse_polish_notation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] tokens=new String[n];
        for(int i=0;i<n;i++){
            tokens[i]=sc.next();
        }
          Stack<String> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(isOperator(tokens[i])){
                int b=Integer.parseInt(st.pop());
                int a=Integer.parseInt(st.pop());
                int res=0;
                if(tokens[i].equals("+")){
                    res=a+b;
                }
                else if(tokens[i].equals("*")){
                    res=a*b;
                }
                else if(tokens[i].equals("-")){
                    res=a-b;
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
        System.out.println( Integer.parseInt(st.peek()));
    }
    public static boolean isOperator(String str){
        if(str.equals("+") || str.equals("-")||str.equals("*")||str.equals("/")){
            return true;
        }
        return false;
    }
}

  
