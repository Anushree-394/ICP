package Assignment_6;
import java.util.*;
public class combination {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        List<List<Integer>> res=new ArrayList<>();
        func(n,k,1,new ArrayList<>(),res);
        System.out.println(res);
        

    }
     
    public static void func(int n,int k,int i,List<Integer> curr,List<List<Integer>> res){
        if(curr.size()==k){
            res.add(new ArrayList<>(curr));
            return;

        }
        if((k-curr.size())>(n-i+1)){
            return;
        }
        curr.add(i);
        func(n,k,i+1,curr,res);
        curr.remove(curr.size()-1);
        func(n,k,i+1,curr,res);

    }
}
