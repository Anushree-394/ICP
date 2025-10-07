package Pool_30_ques;
import java.util.*;
public class index_of_first_occ_in_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int m=s1.length();
        int n=s2.length();
        for(int i=0;i<=m-n;i++){
            if(s1.substring(i,i+n).equals(s2)){
                System.out.println(i);
            }
        }
        System.out.println(-1);

        

        

    }
}
