package Day_11;
import java.util.*;
public class reverse_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
         Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        System.out.println( sb.toString());
    

    }
}
