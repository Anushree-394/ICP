package Assignment_4;
import java.util.*;
public class max_consecutives_ones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int left=0;
        int zero=0;
        int ans=Integer.MIN_VALUE;
        for(int right=0;right<n;right++){
            if(arr[right]==0){
                zero++;
            }
            while(zero>k){
                if(arr[left]==0){
                    zero--;
                }
                left++;
            }
            ans=Math.max(ans,right-left+1);

        }
        System.out.println(ans);
    }
}
