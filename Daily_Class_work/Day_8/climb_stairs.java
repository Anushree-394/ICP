package Day_8;
import java.util.*;
public class climb_stairs {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] dp=new int[n+1];
        dp[0]=0;
        
        for(int i=1;i<=n;i++){
            dp[i]=dp[i>>1]+i%2;

        }
        System.out.println(dp);

    }
}
