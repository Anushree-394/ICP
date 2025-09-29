package Day_2;

import java.util.*;
public class max_prod_threeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int prod1=arr[0]*arr[1]*arr[n-1];
        int prod2=arr[n-1]*arr[n-2]*arr[n-3];
        int max=Math.max(prod1,prod2);
        System.out.println(max);
    }
}
