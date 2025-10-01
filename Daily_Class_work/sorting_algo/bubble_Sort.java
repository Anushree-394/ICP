package sorting_algo;
import java.util.*;
public class bubble_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    
        boolean flag=true;
        while(flag){
            flag=false; // to ensure if swap has been done in pass or not
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    flag=true; //indicates swapping is done
                }

            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
