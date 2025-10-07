package Pool_30_ques;
import java.util.*;
public class maximum_69_no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
         String str=Integer.toString(num);
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='6'){
                arr[i]='9';
                break;
            }
        }
        System.out.println(Integer.parseInt(new String(arr))); 
        //parseint string s int mai convert krdi
    }
    
}
