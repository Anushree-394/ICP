package Assignment_5;
import java.util.*;
public class min_arrows_to_burst_balloon {
    public static void main(String[] args){
        int[][] arr= {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(func(arr));
    }
    public static int func(int[][] arr){
        if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr,(a,b) -> Integer.compare(a[1],b[1]));
        int arrow=1;
        int a=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>a){
                arrow++;
                a=arr[i][1];
            }
        }
        return arrow;

    }
}
