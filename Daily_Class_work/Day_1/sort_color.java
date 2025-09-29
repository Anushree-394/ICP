package Day_1;
import java.util.*;
public class sort_color {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int count_0=0;
        int count_1=0;
        int count_2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count_0++;
            }
            else if(nums[i]==1){
                count_1++;
            }
            else{
                count_2++;
            }
        }
        int i=0;
        while(count_0-->0){
            nums[i]=0;
            i++;
        
        }
        while(count_1-->0){
            nums[i]=1;
            i++;
        }
        while(count_2-->0){
            nums[i]=2;
            i++;
        }
        for(int j=0;j<n;j++){
            System.out.println(nums[j]+" ");
        }

        
    }
}
