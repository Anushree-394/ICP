package Day_3;
import java.util.*;
public class convert_1d_into_2d {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int col=sc.nextInt();
        int row=sc.nextInt();
        int[][] nums=new int[row][col];
        int k=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                nums[i][j]=arr[k];
                k++;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println(nums[i][j]+" ");
            }
        }
    }
}
