package Pool_30_ques;
import java.util.*;
public class Town_judge {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int[][] trust=new int[m][2];
       for(int i=0;i<m;i++){
           trust[i][0]=sc.nextInt();
           trust[i][1]=sc.nextInt();
       }
       System.out.println(findJudge(n,trust));
   }
   public static int findJudge(int n, int[][] trust) {
        int [] count=new int[n+1];
        int m=trust.length;
        for(int i=0;i<m;i++){
            int a=trust[i][0];
            int b=trust[i][1];
            count[a]--;
            count[b]++;

        }
        for(int i= 1;i<=n;i++){
            if(count[i]==n-1){
                return i;
            }
        }
        return -1;
    }

}
