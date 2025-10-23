package Pool_30_ques;
import java.util.*;
public class can_place_flower {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] flowerbed=new int[n];
        for(int i=0;i<n;i++){
            flowerbed[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.println(canPlaceFlowers(flowerbed,m));
    }
     public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int k=flowerbed.length;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                boolean left=(i==0 || flowerbed[i-1]==0);
                boolean right=(i==k-1 || flowerbed[i+1]==0); 
                if(left && right){
                    flowerbed[i]=1;
                    n--;
                }
                
            }
        }
        if(n<=0){
            return true;
        }
        return false;
    }
}
