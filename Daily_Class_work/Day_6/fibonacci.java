package Day_6;
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        func(n,0,1);
        sc.close();

    }
    public static void func(int n,int a,int b){
        if(n==0 ){
            return;
        }
        System.out.println(a+" ");
        func(n-1,b,a+b);

        
    }
}
