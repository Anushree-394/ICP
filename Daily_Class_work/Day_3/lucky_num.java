package Day_3;

import java.util.*;

public class lucky_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] []matrix =new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        HashSet<Integer> minSet = new HashSet<>();
        HashSet<Integer> maxSet = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                min=Math.min(min,matrix[i][j]);
            }
            minSet.add(min);
        }
        for(int i=0;i<matrix[0].length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                max=Math.max(max,matrix[j][i]);
            }
            maxSet.add(max);
        }
         List<Integer> list = new ArrayList<>();
         for(int i:minSet){
            if(maxSet.contains(i)){
                list.add(i);
            }
         }
         for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
