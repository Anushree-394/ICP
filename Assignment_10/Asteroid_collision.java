package Assignment_10;
import java.util.*;
public class Asteroid_collision {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
         Stack<Integer> st=new Stack<>();
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                st.push(a[i]);
            }
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(a[i])){
                    st.pop();
                   

                }
                if(!st.isEmpty() && st.peek()==Math.abs(a[i])){
                    st.pop();
                }
                else if(st.isEmpty()||st.peek()<0){
                    st.push(a[i]);
                }
                

            }
        }
        int[] res=new int[st.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i]=st.pop();
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]+" ");
        }
        


    }
    
}
