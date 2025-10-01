package Day_4;
import java.util.*;
public class longest_Substring_without_rep_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int max_len=Integer.MIN_VALUE;
        int right=0;
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                max_len=Math.max(max_len,right-left+1);
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        System.out.println(max_len);
    
    }
}
