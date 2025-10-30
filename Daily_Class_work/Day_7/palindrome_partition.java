package Day_7;
import java.util.*;
public class palindrome_partition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        List<List<String>> res=new ArrayList<>();
        List<String> li=new ArrayList<>();
        func(res,li,s);
       



    }
   
    public static void func(List<List<String>> res,List<String> al,String s){
        if(s.length()==0){
            res.add(new ArrayList<>(al));
            return;
        }
        for(int i=1;i<=s.length();i++){
            String c=s.substring(0,i);
            if(ispalindrome(c)){
                al.add(c);
                func(res,al,s.substring(i));
                al.remove(al.size()-1);
            }
        }

    }
    public static boolean ispalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
