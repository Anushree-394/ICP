package Assignment_7;
import java.util.*;
public class House_Robber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(rob(arr));

    }
    public static int rob(int[] nums) {
        int[] dp=new int[nums.length];
        // Arrays.fill(dp,-1);
        return  func(nums,dp);

    }
    public static int func(int[] nums,int[] dp){
        int n=nums.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return nums[0];
        }
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        return dp[n-1];
    }

}
