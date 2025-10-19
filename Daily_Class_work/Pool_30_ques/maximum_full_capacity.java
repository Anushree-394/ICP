package Pool_30_ques;
import java.util.*;
public class maximum_full_capacity {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] capacity=new int[n];
        for(int i=0;i<n;i++){
            capacity[i]=sc.nextInt();
        }
        int[] rocks=new int[n];
        for(int i=0;i<n;i++){
            rocks[i]=sc.nextInt();
        }
        int add=sc.nextInt();
        System.out.println(maximumBags(capacity,rocks,add));
        sc.close();
    }
    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n=capacity.length;
        for(int i=0;i<n;i++){
            capacity[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(capacity);// jissa jinka diff km hai aage aajyenge jissa hmko satisfy krdenge
        int c=0;
        for(int i=0;i<n;i++){
            if(additionalRocks>=capacity[i]){
                additionalRocks-=capacity[i];
                c++;
            }
            else if(capacity[i]==0){
                c++;
            }

        }
        return c;
    }
}
