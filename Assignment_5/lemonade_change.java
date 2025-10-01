package Assignment_5;
import java.util.*;
public class lemonade_change {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] bills=new int[n];
        for(int i=0;i<n;i++){
            bills[i]=sc.nextInt();
        }
         int count_five=0;
        int count_ten=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                count_five++;
            }
            else if(bills[i]==10){
                if(count_five>0){
                    count_five--;
                    count_ten=count_ten+1;
                }
                else{
                    System.out.println(false);
                }
            }
            else if(bills[i]==20){
                if(count_five>0 && count_ten>0){
                    count_five--;
                    count_ten--;
                }
                else if(count_five>=3){
                    count_five=count_five-3;
                    
                }
                else{
                    System.out.println(false);
                }
            }

        }
        System.out.println(true);

    }
}
