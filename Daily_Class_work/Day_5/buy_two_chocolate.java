package Day_5;
import java.util.*;
public class buy_two_chocolate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int firstmin=Integer.MAX_VALUE;
        int n=sc.nextInt();
        int[] prices=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();

        }
        int money=sc.nextInt();
        int secmin=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<firstmin){
                secmin=firstmin;
                firstmin=prices[i];
            }
            else if (prices[i] < secmin) {
                secmin = prices[i];
            }
      
        }
        int sum=firstmin+secmin;
        if(sum<=money){
            System.out.println(money-sum);
        }
        System.out.println(money);
    }
}
