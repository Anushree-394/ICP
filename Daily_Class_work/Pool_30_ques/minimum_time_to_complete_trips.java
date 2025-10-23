package Pool_30_ques;
import java.util.*;
public class minimum_time_to_complete_trips {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] time=new int[n];
        for(int i=0;i<n;i++){
            time[i]=sc.nextInt();
        }
        int totalTrips=sc.nextInt();
        System.out.println(minimumTime(time,totalTrips));
        
    }
     public static long minimumTime(int[] time, int totalTrips) {
        Arrays.sort(time);
        long low=time[0];
        long high=(long)low*totalTrips;
        long ans=0;
        while(low<=high){
            
            long mid=low+(high-low)/2;
            if(ischeck(time,mid,totalTrips)){
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    public static boolean ischeck(int[] time,long mid,int total){
        long t=0;
        for(int i=0;i<time.length;i++){
            t+=mid/time[i];
           
        }
         if(t>=total){
                return true;
            }
        return false;
    }
}
