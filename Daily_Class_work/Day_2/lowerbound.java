package Day_2;

import java.util.*;
public class lowerbound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        // for(int i=0;i<n;i++){
        //     if(arr[i]>=target){
        //        System.out.print(i);
        //        return;
        //     }
        // }
        // System.out.println(n); //tc=O(n)
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1; // since hmko smallest possible value chiye toh hm peeche bhj denge

            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}
//binary search is used so tc=>O(log n)