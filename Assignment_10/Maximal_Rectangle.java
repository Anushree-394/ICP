package Assignment_10;
import java.util.*;
public class Maximal_Rectangle {
    public static void main(String[] args){
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
        System.out.println(maximalRectangle(arr));

    }
     public static int maximalRectangle(char[][] matrix) {
        int ans = 0;
        int[] arr = new int[matrix[0].length];
        for(char[] a: matrix){
            for(int i=0; i<a.length; i++){
                if(a[i] == '0'){
                    arr[i] = 0;
                }else{
                    arr[i] += 1;
                }
            }
            ans = Math.max(ans, largest_rectangle(arr));
        }
        return ans;
    
    }
    public static int largest_rectangle(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int area = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && arr[i] < arr[st.peek()]) {
                int h = arr[st.pop()];
                int r = i;
                if (st.empty()) {
                    area = Math.max(area, h * r);
                } else {
                    int l = st.peek();
                    area = Math.max(area, h * (r - l - 1));
                }
            }
            st.push(i);
        }
        int r = arr.length;
        while (!st.empty()) {
            int h = arr[st.pop()];
            if (st.empty()) {
                area = Math.max(area, h * r);
            } else {
                int l = st.peek();
                area = Math.max(area, h * (r - l - 1));
            }
        }
        return area;
    }

}
