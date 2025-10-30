package Day_7;
import java.util.*;
public class N_queen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         List<List<String>>  ans=new ArrayList<>();
        String[][] arr=new String[n][n];
        for(String[] a:arr){
            Arrays.fill(a,".");
        }
        queen(arr,0,n, ans);
        System.out.println(ans.size());
    }
    public static void  queen(String[][] arr,int cr,int n, List<List<String>> ans){
        if(cr==n){
            List<String> res=new ArrayList<>();
            for(int i=0;i<n;i++){
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<n;j++){
                    sb.append(arr[i][j]);
                }
                res.add(sb.toString());
            }
            ans.add(res);
            return;
            
            
        }
        for(int c=0;c<n;c++){
            if(isitsafe(arr,cr,c)){
                arr[cr][c]="Q";
                queen(arr,cr+1,n,ans);
                arr[cr][c]=".";
            }
        }
    }
    public static boolean isitsafe(String[][] board,int cr,int cc){
        //upwardd => upr check krenge ki queen na ho (column wisee ki particular column m na ho)
        for(int i=cr;i>=0;i--){
            if(board[i][cc]=="Q"){
                return false;
            }
        }
        int row=cr; // nya var liya hai kyuki jo given row h usko ni modify krna ,since usko dubara bhi use krna
        int col=cc;
        while(row>=0 && col>=0){ //diagonally leftt
            if(board[row][col]=="Q"){
                return false;
            }
            row--;
            col--;
        }
         row=cr;
         col=cc;
        while(row>=0 && col<board[0].length){ //diagonally righttt check krenge
            if(board[row][col]=="Q"){
                return false;
            }
            row--;
            col++;
        }
        return true;


    }
    
}
