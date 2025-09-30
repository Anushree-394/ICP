package Day_3;
import java.util.*;
public class set_matrix_zero {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
    int m=sc.nextInt();
    int[] [] matrix=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    HashSet<Integer> set1=new HashSet<>();
    HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    set1.add(i);
                    set2.add(j);
                }
            }
        }
        for(int i1:set1){
            rowzero(matrix,i1);
        }
        for(int i2:set2){
            colzero(matrix,i2);
        }

    }
    private static void rowzero(int[][] matrix,int row){
        for(int col=0;col<matrix[0].length;col++){
            matrix[row][col]=0;
        }

    }
    private static void colzero(int[][] matrix,int col){
        for(int row=0;row<matrix.length;row++){
            matrix[row][col]=0;
        }

    }
    
}
