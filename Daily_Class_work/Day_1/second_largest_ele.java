package Day_1;
import java.util.*;

public class second_largest_ele {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     max=Math.max(max,nums[i]);
        // }
        // int sec_m=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     if(max!=nums[i]){
        //         sec_m=Math.max(sec_m,nums[i]);
        //     }
        // }
        // System.out.print(sec_m);
        int max=Integer.MIN_VALUE;
        int s_max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(nums[i]>max){
                s_max=max;
                max=nums[i];
                
            }
            else{
                if(nums[i]>s_max && nums[i]!=max){
                    s_max=nums[i];

                }
            }
        }
        System.out.println(s_max);


    }
}
