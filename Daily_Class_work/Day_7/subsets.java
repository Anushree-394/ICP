package Day_7;
import java.util.*;
public class subsets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] nums={1,2,3};
         List<List<Integer>>res=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        func(nums,0,li,res);
        System.out.println(res);
    }
     public static void func(int[] nums,int index,List<Integer> li, List<List<Integer>>res){
        // if(index==nums.length){
        //     res.add(new ArrayList<>(li));
        //     return;

        // }
        // li.add(nums[index]);
        // func(nums,index+1,li,res);
        // li.remove(li.size()-1);
        // func(nums,index+1,li,res);
        res.add(new ArrayList<>(li));
        for(int i=index;i<nums.length;i++){
            li.add(nums[i]);
            func(nums,i+1,li,res);
            li.remove(li.size()-1);
        }

    }
}
