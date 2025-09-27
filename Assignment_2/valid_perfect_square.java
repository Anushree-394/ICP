package Assignment_2;
import java.util.*;
public class valid_perfect_square {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long low=1;
    long high=n;
    while(low<=high){
        long mid=low+(high-low)/2;
        long sq=mid*mid; //to check wheter mid is a perfect square or not
        if(sq==n){
            System.out.print(true);
            return; 
        }
        else if(sq<n){ //since we needd bigger value so move right
            low=mid+1;
        }
        else{
            high=mid-1; //move left since we needd smaller value
        }


    }
    System.out.println(false); //no is not perfect square
  }
}
//tc=> O(log n)