package Day_5;
import java.util.*;
public class coin_change {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr={10,5,2,1};
        int c=0;
        for(int i=0;i<arr.length;i++){
            while(n>=arr[i]){
               n=n-arr[i];
               c++;
               
            }
        }
        System.out.println(c);
    }
}
