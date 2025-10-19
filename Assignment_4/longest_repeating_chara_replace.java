package Assignment_4;
import java.util.*;
public class longest_repeating_chara_replace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        System.out.println(characterReplacement(s,k));


    }
    public static int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int left=0;
        int max_c=-1;
        int max=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            freq[ch-'A']++;
            max_c=Math.max(max_c,freq[ch-'A']);
            while((r-left+1)- max_c> k){
                char c=s.charAt(left);
                freq[c-'A']--;
                left++;
            }
            max=Math.max(max,r-left+1);


        }
        return max;
    }
}
