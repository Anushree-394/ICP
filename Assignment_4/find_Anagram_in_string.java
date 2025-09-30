package Assignment_4;
import java.util.*;
public class find_Anagram_in_string {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(anagram(s1,s2));
        


    }
    public static List<Integer> anagram(String s1,String s2){
         List<Integer> al=new ArrayList<>();

        int[] f1=new int[26];
        
        int[] f2=new int[26];
        for(int i=0;i<s2.length();i++){
            f1[s2.charAt(i)-'a']++;
        }
        int i=0;
        int j=0;
        while(j<s1.length()){
            f2[s1.charAt(j)-'a']++;
            if((j-i+1)>s2.length()){
                f2[s1.charAt(i)-'a']--;
                i++;
            }
            if((check(f1,f2))){
                al.add(i);
            }
            j++;
        }
        return al;


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
