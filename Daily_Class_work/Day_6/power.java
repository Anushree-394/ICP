package Day_6;

public class power {
    public static void main(String[] args){
        int n=8;
        System.out.println((func(n)));

    }
    public static int func(int n){
        if(n==0){
            return 1;
        }
        return 2*func(n-1);
    }
}
