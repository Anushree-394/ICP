package Day_11;
import java.util.*;
public class next_greater {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums1=new int[n];
        for(int i=0;i<n;i++){
            nums1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] nums2=new int[m];
        for(int i=0;i<m;i++){
            nums2[i]=sc.nextInt();
        }
        int[] arr=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    for(int k=j+1;k<nums2.length;k++){
                        if(nums2[k]>nums2[j]){
                            arr[i]=nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
        }
        System.out.println(arr);
    }
    
}
