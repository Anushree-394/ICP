package Day_5;
import java.util.*;
public class jump_game2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();

        }
        int maxjump=0;
        int c=0;
        int endjump=0;
        for(int i=0;i<nums.length-1;i++){
            maxjump=Math.max(maxjump,nums[i]+i);
            if(i==endjump){
               c++;
               endjump=maxjump;
            }
        }
        System.out.println(c);
    }
}
