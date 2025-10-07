package Pool_30_ques;
import java.util.*;
public class product_of_array_less_than_k {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();

         if(k<=1){
            System.out.println(0);
        }
        int left=0;
        int prod=1;
        int count=0;
        for(int right=0;right<nums.length;right++){
            prod*=nums[right];
            while(prod>=k){
                prod/=nums[left];
                left++;
            }
            count=count+right-left+1;
        }
        System.out.println(count);
    }
    
}
