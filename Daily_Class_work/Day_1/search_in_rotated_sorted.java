package Day_1;
import java.util.*;
public class search_in_rotated_sorted {
    public static void main(String[] args){
        //appraoch 1 => tc:-O(log n)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(nums[low]<=nums[mid]){
                if(target>=nums[low] && target<nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(target>nums[mid] && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        System.out.println(-1);
        
        // appraoch 2
        // for(int i=0;i<n;i++){
        //      if(nums[i]==target){
        //         return i;

        //     }
        // }
        //return -1; //tc=>0(n)
    
    }
}
