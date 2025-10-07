package Day_8;
import java.util.*;
public class fibbonaci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        System.out.println(func(n,dp)); 
    }
     public static int func(int n,int[] dp){
        if(n<=1){
            return n;
        }
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
           dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

    }
}
