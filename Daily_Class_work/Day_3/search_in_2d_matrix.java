package Day_3;
import java.util.*;
public class search_in_2d_matrix {
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
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            int low=0;
            int high=m-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(matrix[i][mid]==target){
                    System.out.println(true);
                }
                else if(matrix[i][mid]<target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
                
            }
           
        }
        System.out.println(false);
    }
    

}
