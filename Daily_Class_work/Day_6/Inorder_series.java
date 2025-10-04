package Day_6;
import java.util.*;
public class Inorder_series {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       func(n);
   }
    public static void func(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        func(n-1);
        System.out.println(n);
        func(n-1);
    }
}
