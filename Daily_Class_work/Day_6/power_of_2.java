package Day_6;
import java.util.*;
public class power_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(power(n));
        sc.close();
        
    }
    

    public static boolean power(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 2 == 0 && power(n / 2)) {
            return true;
        } else {
            return false;
        }
    }
}