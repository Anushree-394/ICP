package Day_5;
import java.util.*;
public class candy {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ratings=new int[n];
        for(int i=0;i<n;i++){
            ratings[i]=sc.nextInt();

        }
        int[] arr=new int[ratings.length];
        for(int i=0;i<ratings.length;i++){
            arr[i]=1;
        }
        int c=0;
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                arr[i]=arr[i-1]+1;
            }
        }
        
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                arr[i]=Math.max(arr[i],arr[i+1]+1);
            }
        }
        for(int i=0;i<ratings.length;i++){
            c=c+arr[i];
        }
        System.out.println(c);

    }
}
