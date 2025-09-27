package Assignment_2;
import java.util.*;
public class kth_largest_ele {
    public static void main(String[] args){
        //tc=> nlogk
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            if(pq.size()<k){
                pq.add(arr[i]);
            }
            else if(arr[i]>pq.peek()){
                pq.poll(); //chota element out hojaega
                pq.add(arr[i]); //nya bda ele
            }
        }
        System.out.println(pq.peek()); //last mai kth largest ele rh jyega 

        //brute force
        //Arrays.sort(arr);
        //return arr[arr.length-k];

        
        
    }
}

