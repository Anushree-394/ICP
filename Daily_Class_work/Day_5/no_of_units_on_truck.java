package Day_5;
import java.util.*;
public class no_of_units_on_truck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] boxTypes=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                boxTypes[i][j]=sc.nextInt();
            }
            
        }
        int truckSize=sc.nextInt();
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int capacity=0;
        int i=0;
        while(i<boxTypes.length && truckSize>0){
            int box=boxTypes[i][0];
            int units=boxTypes[i][1];
            if(truckSize>box){
                capacity+=box*units;
                truckSize=truckSize-box;
            }
            else{
                capacity+=truckSize*units;
                truckSize=0;
            }
            i++;
        }
        System.err.println(capacity);
    }
}
