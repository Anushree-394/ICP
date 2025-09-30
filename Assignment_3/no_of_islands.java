package Assignment_3;
import java.util.*;
public class no_of_islands {
    //dfs approach used
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char [][] arr=new char[n][m];
        for(int i=0;i<n;i++){
            String s=sc.next();
            for(int j=0;j<m;j++){
                arr[i][j]=s.charAt(j);
            }
        }
        if(arr==null || n==0 || m==0){
            System.out.println(0);
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]=='1'){
                    dfs(arr,i,j);
                    count++;
                }
            }

        }
        System.out.println(count);

    }
    public static void dfs(char[][] arr,int i,int j){
        if(i<0|| i>=arr.length || j<0 || j>=arr[0].length || arr[i][j]=='0'){
            return;
        }
        arr[i][j]='0';
        dfs(arr,i,j+1);
        dfs(arr,i,j-1);
        dfs(arr,i+1,j);
        dfs(arr,i-1,j);

    }
}
