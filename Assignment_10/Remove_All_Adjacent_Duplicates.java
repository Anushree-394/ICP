package Assignment_10;
import java.util.*;
public class Remove_All_Adjacent_Duplicates {
    public static void main(String[] main){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        System.out.println(removeDuplicates(s, k));
    }
    public static  String removeDuplicates(String s, int k) {
        Stack<Integer> count=new Stack<>();
        Stack<Character> char1=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!char1.isEmpty() && s.charAt(i)==char1.peek()){
                count.push(count.pop()+1);
            }
            else{
                char1.push(s.charAt(i));
                count.push(1);
            }
            if(count.peek()==k){
                char1.pop();
                count.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!char1.isEmpty()){
            char ch=char1.pop();
            int c=count.pop();
            for(int i=0;i<c;i++){
                sb.append(ch);
            }
        }
        sb.reverse();
        return sb.toString();
    }
}
