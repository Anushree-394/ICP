package Assignment_10;
import java.util.*;
public class Car_Fleet {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a1=new int[n];
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();

        }
        int[] a2=new int[n];
        for(int i=0;i<n;i++){
            a2[i]=sc.nextInt();

        }
        int target=sc.nextInt();
        System.out.println(carFleet(target,a1,a2));


    }
    public static int carFleet(int target, int[] position, int[] speed) {
        double[][] arr=new double[speed.length][2];
        Stack<Double> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            arr[i][0]=position[i];
            arr[i][1]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(arr,(a,b)->Double.valueOf(a[0]).compareTo(b[0]));
        for(int i=position.length-1;i>=0;i--){
            if(st.isEmpty() || arr[i][1]>st.peek()){
                st.push(arr[i][1]);

            }
        } 
        return st.size();
    }
}
