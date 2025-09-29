import java.util.*;
public class selection_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){ //no of passes to be one
            int min_index=i;
            for(int j=i+1;j<n;i++){ // traverse over unsorted part of array
                if(arr[min_index]>arr[j]){
                    min_index=j; //min ele is found for swapping
                }
            }
            int temp=arr[min_index]; // swapping of min ele at curr index
            arr[min_index]=arr[i];
            arr[i]=temp;
            
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
