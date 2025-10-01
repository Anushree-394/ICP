package Day_5;
import java.util.*;
public class assign_cookies {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] g=new int[n];
        for(int i=0;i<n;i++){
            g[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] s=new int[m];
        for(int i=0;i<m;i++){
            s[i]=sc.nextInt();
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int count=0;
        while(i<s.length && j<g.length){
            if(s[i]>=g[j]){
                count++;
                i++;
                j++;
                
            }
            else{
                i++;
            }
        }
        System.out.println(count);
    }
}
