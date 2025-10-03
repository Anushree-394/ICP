package Day_5;
import java.util.*;
public class gas_station {
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] gas=new int[n];
        for(int i=0;i<n;i++){
            gas[i]=sc.nextInt();
        }
        int[] cost=new int[n];
        for(int i=0;i<n;i++){
            cost[i]=sc.nextInt();
        }
               int gas1=0,cost1=0;
        for(int i=0;i<gas.length;i++){
            gas1+=gas[i];
            cost1+=cost[i];
        }
        if(gas1<cost1){
            
            System.out.println(-1);
        }
        int start=0;
        int diff=0;
        for(int i=0;i<cost.length;i++){
            diff+=gas[i]-cost[i];
            if(diff<0){
                
                diff=0;
                start=i+1;
            }
           
        }
        System.out.println(start);

    
    }
}
