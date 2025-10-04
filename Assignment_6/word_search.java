package Assignment_6;
import java.util.*;
public class word_search {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[] [] a=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.next().charAt(0);
            }
        }
        String word=sc.next();
        System.out.println(word_exist(a,word));
        sc.close();


    }
    public static boolean word_exist(char[][] boards, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < boards.length; i++) {
            for (int j = 0; j < boards[0].length; j++) {
                if (boards[i][j] == words[0] && exist(boards, i, j, words, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean exist(char[][] grid, int i, int j, char[] a, int indx) {
        if (i < 0 || j < 0 || j > grid[0].length - 1 || i > grid.length - 1 || grid[i][j] != a[indx]) {
            return false;
        }
        if (indx == a.length - 1) {
            return true;
        }
        char ch = grid[i][j];
        grid[i][j] = '*';
        boolean r = exist(grid, i - 1, j, a, indx + 1) || exist(grid, i + 1, j, a, indx + 1)
                || exist(grid, i, j - 1, a, indx + 1) || exist(grid, i, j + 1, a, indx + 1);
        grid[i][j] = ch;
        return r;
    }

}

