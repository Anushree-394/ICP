package Day_2;

import java.util.*;
public class median_of_sorted_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();

        }
        //now we need to merge them in order to find median
        int[] nums=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){ // this is done to merge them such that they remain sorted
                nums[k]=arr1[i];
                i++;
                k++;
            }
            else{
                nums[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            nums[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n){
            nums[k]=arr2[j];
            j++;
            k++;
        }
        int total=m+n;
        if(total%2==1){
            System.out.println(nums[total/2]);
            return;
        }
        System.out.println((nums[total/2]+nums[total/2-1])/2);

    }
}
