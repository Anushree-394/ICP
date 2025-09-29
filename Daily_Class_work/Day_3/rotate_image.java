package Day_3;
import java.util.*;
public class rotate_image {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] [] matrix=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    for(int col=0;col<n;col++){
        for(int row=col;row<n;row++){
            int temp=matrix[col][row];
            matrix[col][row]=matrix[row][col];
            matrix[row][col]=temp;

        }
    }
        //reverse
    for(int i=0;i<n;i++){
        int left=0;
        int right=n-1;
        while(left<right){
            int temp=matrix[i][left];
            matrix[i][left]=matrix[i][right];
            matrix[i][right]=temp;
            left++;
            right--;

        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.println(matrix[i][j]);
        }
    }

    }
}


