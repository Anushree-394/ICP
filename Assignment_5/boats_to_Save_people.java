package Assignment_5;
import java.util.*;
public class boats_to_Save_people {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]  people=new int[n];
        for(int i=0;i<n;i++){
            people[i]=sc.nextInt();
        }
        int limit=sc.nextInt();
         int boats=0;
        Arrays.sort(people);
        int j=people.length-1;
        int i=0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                boats++;
                i++;
                j--;

            }
            else{
                j--;
                boats++;
            }


        }
        System.out.println(boats);
    }
    
}
