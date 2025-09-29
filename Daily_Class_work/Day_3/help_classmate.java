package Day_3;
import java.util.*;
public class help_classmate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         Stack<Integer> st=new Stack<>();
        int[] nums=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                nums[i]=-1;
            }
            else{
                nums[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }

    }
}
