package Assignment_2;
import java.util.*;
public class merge_sorted_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr1=new int[n+m];
        for(int i=0;i<n+m;i++){
            arr1[i]=sc.nextInt();
        }
        
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        //brute force
        //tc=>nlogn
        // int k=0;
        // for(int i=n;i<arr1.length;i++){
        //     arr1[i]=arr2[k];
        // }
        // Arrays.sort(arr1);
        // System.out.println(arr1);
        int frst=n-1;
        int sec=m-1;
        int k=m+n-1; //last s ele bithane hai 
        for(int c=k;c>=0;c--){
            if(sec<0){
                break;
            }
            if(frst>=0 && arr1[frst]>arr2[sec] ){  
                arr1[c]=arr1[frst];
                frst--;
                
            }
            else{
                arr1[c]=arr2[sec];
                sec--;
            }

        }
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+" ");
        }

    }
}
