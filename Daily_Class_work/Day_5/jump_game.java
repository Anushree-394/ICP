package Day_5;
import java.util.*;
public class jump_game {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();

        }
        int maxreach=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxreach){
                System.out.println(false);
            }
            maxreach=Math.max(maxreach,nums[i]+i);
        }
        System.out.println(true);
    }
}
