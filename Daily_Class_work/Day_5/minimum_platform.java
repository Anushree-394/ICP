package Day_5;
import java.util.*;
public class minimum_platform {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         int[] dep=new int[n];
        for(int i=0;i<n;i++){
            dep[i]=sc.nextInt();
        }
         Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0;
        int j=0;
        int count=0;
        int ans=0;
        while(i<arr.length ){
            if(arr[i]<=dep[j]){
                count++;
                ans=Math.max(ans,count);
                
                i++;
            }
            else if(arr[i]>dep[j]){
                count--;
                j++;
            }
        }
        System.out.println(ans);
         
    }
}
