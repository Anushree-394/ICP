package Day_6;
import java.util.*;
public class sum_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr={1,2,3,4,2,1};

    }
    public static int func(int[] arr,int i,int sum){
        if(i==arr.length){
            return sum;

        }
        return func(arr, i+1, sum+arr[i]);
    }
}
