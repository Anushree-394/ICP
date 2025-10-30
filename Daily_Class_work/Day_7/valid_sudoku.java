package Day_7;
import java.util.*;
public class valid_sudoku {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int m=sc.nextInt();
        char[] []arr =new char[n][n];
        for(int i=0;i<n;i++){
            String s=sc.next();
            for(int j=0;j<n;j++){
                arr[i][j]=s.charAt(j);
            }
        }
        System.out.println(isValidSudoku(arr));
    }
     public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    if(!isvalid(board,i,j)){
                        return false;
                    }

                }
               
            }
        }
        return true;
    }
    public static boolean isvalid(char[][] board,int row,int col){
        //col mai check krenge
        for(int i=0;i<9;i++){
            if(i!=row && board[i][col]==board[row][col]){
                return false;
            }
        }
        // row mai check krenge
        for(int i=0;i<9;i++){
            if(i!=col && board[row][i]==board[row][col]){
                return false;
            }
        }
        int cr=(row/3)*3; //row marix k liye
        int cc=(col/3)*3;
        for(int i=0;i<9;i++){
            if(cr+i/3==row && cc+i%3==col){ // curr ele ko consider hi nhi krna
                continue;
            }
            if(board[cr+i/3][cc+i%3]==board[row][col]){
                return false;
            }

        }
        return true;


    }
}
