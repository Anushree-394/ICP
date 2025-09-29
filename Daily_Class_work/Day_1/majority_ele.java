package Day_1;
import java.util.*;
public class majority_ele {
    public static void main(String[] args){
        // ele appearing more than n/2 times
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        // }
        // int c=0;
        // for(int key:map.keySet()){
        //     if(map.get(key)>n/2){
        //         System.out.print(key);
        //        
                
        //     }
        // }
        //

        //optimal approach
        int frst=arr[0];
        int c=1;
        for(int i=1;i<n;i++){
            if(arr[i]==frst){
                c++;
            }
            else{
                c--;
                if(c==0){
                    frst=arr[i]; //jese hi ya 0 then hm nya ele lele
                    c=1;
                }
            }
        }
        System.out.println(frst);
    }
//moore voting prblm sirf tbh use tbh pta ho ki ele exist krta hai otherwise hashmap since dono ki time complexity same hai O(n)
    
}
