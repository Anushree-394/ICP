package Assignment_5;
import java.util.*;
public class non_overlapping_intervals {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] [] intervals=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                intervals[i][j]=sc.nextInt();
            }
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int c=0;
        int prev=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(prev<=intervals[i][0]){
                prev=intervals[i][1];
            }
            else{
                c++;
            }
        }
        System.out.println(c);
    }
}
