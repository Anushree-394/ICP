package Day_6;
import java.util.*;
public class reverse_string {
    public static void main(String[] main){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char s[] = new char[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next().charAt(0);
        }
        reverse(s, 0, 0);
        sc.close();
    }

    public static void reverse(char[] s, int i, int j) {
        if (i >= j) {
            return;
        }
        char a = s[i];
        s[i] = s[j];
        s[j] = a;
        return;
    }
        
    
}
