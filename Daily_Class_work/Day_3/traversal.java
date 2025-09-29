package Day_3;
import java.util.*;
public class traversal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] [] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // row_print(arr);
        // col_print(arr);
       spiral(arr);

    }
    public static void row_print(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void col_print(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
         for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void spiral(int [][] arr){
        int m=arr.length;
        int n=arr[0].length;
        int min_row=0;
        int max_row=m-1;
        int min_col=0;
        int max_col=n-1;
        int total_ele=m*n;
        while(total_ele-->0){
            for(int i=min_col;i<=max_col && total_ele>0;i++){
                System.out.print(arr[min_row][i]+" ");
                total_ele++;
            }
            min_row++;
            for(int i=min_row;i<=max_row && total_ele>0;i++){
                System.out.print(arr[i][max_col]+" ");
                total_ele++;
            }
            max_col--;
            for(int i=max_col;i>=min_col && total_ele>0;i--){
                System.out.print(arr[max_row][i]+" ");
                total_ele++;
            }
            max_row--;
            for(int i=max_row;i>=min_row && total_ele>0;i--){
                System.out.print(arr[i][min_col]+" ");
                total_ele++;
            }
            min_col++;
        }
       
    }
    public static void reverse_matrix(int[] [] arr){
        int m=arr.length;
        int n=arr[0].length;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[i][j]);
            }

        }
    }
}
