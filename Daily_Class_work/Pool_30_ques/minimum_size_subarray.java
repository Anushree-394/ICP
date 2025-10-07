package Pool_30_ques;

import java.util.Scanner;

public class minimum_size_subarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
         int left=0;
        int min_l=Integer.MAX_VALUE;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                min_l=Math.min(min_l,right-left+1);
                sum-=nums[left];
                left++;

            }
            

        }
        if(min_l==Integer.MAX_VALUE){
            System.out.println(0);
        }
        System.out.println(min_l);

    }
    
}
