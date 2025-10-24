package Day_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class combination_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        List<List<Integer>> al=new ArrayList<>();
        Arrays.sort(arr);
        func(al,new ArrayList<>(),target,arr,0);
        System.out.println(al);
    }
    public static void func(List<List<Integer>> al,List<Integer> li,int target,int[] nums,int start){
        if(target==0){
            al.add(new ArrayList<>(li));
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]>target){
                break;
            }
            li.add(nums[i]);
            func(al,li,target-nums[i],nums,i+1);
            li.remove(li.size()-1);
        }

    }
}
