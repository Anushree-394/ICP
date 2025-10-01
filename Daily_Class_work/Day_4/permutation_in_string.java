package Day_4;
import java.util.*;
public class permutation_in_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(func(s1,s2));
        


    }
    public static boolean func(String s1,String s2){
        int[] f1=new int[26];
        
        int[] f2=new int[26];
        for(int i=0;i<s1.length();i++){
            f1[s1.charAt(i)-'a']++;
        }
        int i=0;
        int j=0;
        while(j<s2.length()){
            f2[s2.charAt(j)-'a']++;
            if((j-i+1)>s1.length()){
                f2[s2.charAt(i)-'a']--;
                i++;
            }
            if((check(f1,f2))){
                return true;
            }
            j++;
        }
        return false;


    }
    public static boolean check(int[] f1,int[] f2){
        for(int i=0;i<26;i++){
            if(f1[i]!=f2[i]){
                return false;
            }
        }
        return true;
    }

}
