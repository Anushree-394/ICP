package Day_4;

import java.util.*;

public class largest_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

    }
    public String largestNumber(int[] nums) {
        String[] str=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i]=String.valueOf(nums[i]);
            
        }
        Arrays.sort(str,(a,b)-> (b+a).compareTo(a+b));
       
        if(str[0].equals("0")){
            return "0";
            
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length;i++){
            sb.append(str[i]);
        }
       
        return sb.toString();
    }
    
}
