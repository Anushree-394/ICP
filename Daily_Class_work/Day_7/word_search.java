package Day_7;
import java.util.*;
public class word_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] []arr =new char[n][n];
        for(int i=0;i<n;i++){
            String s=sc.next();
            for(int j=0;j<n;j++){
                arr[i][j]=s.charAt(j);
            }
        }
        String word=sc.next();
        System.out.println(exist(arr,word));
    }
    public static boolean exist(char[][] board, String word) {
        char[] words=word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==words[0] && exist(board,words,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean exist(char[][] board,char[] words,int i,int j,int index){
     if(i<0 || j<0 || i> board.length-1 || j> board[0].length-1 || board[i][j]!=words[index]){
        return false;
     }
     if(index==words.length-1){ //sare words milte chle gye
        return true;
     } 
     char ch=board[i][j];
     board[i][j]='*';
     boolean r=exist(board,words,i+1,j,index+1) || exist(board,words,i-1,j,index+1) || exist(board,words,i,j+1,index+1) || exist(board,words,i,j-1,index+1);
     board[i][j]=ch;
     return r;
    }

}
