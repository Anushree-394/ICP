package Day_2;
import java.util.*;
public class find_peak_ele {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        // for(int i=0;i<arr.length;i++){
        //     boolean left=(i==0)||(arr[i]>=arr[i-1]); //handle eadge case
        //     boolean right=(i==n-1)||(arr[i]>=arr[i+1]);
        //     if(left && right){
        //         System.out.println(i);
        //         return ;//peak found;
        //     }


        // }
        // System.out.println(-1); //tc=>O(n)

        int low=0;
        int high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else{
                high=mid; //mid isliye kyuki whi ele bhi hoksta 
            }
        }
        System.out.println(low); //since (low==high) so return low peak find 

    }
}
