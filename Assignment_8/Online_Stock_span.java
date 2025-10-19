package Assignment_8;
import java.util.*;
public class Online_Stock_span {
     private Stack<int[]> st;
    public void StockSpanner() {
        st=new Stack<>();
        
    }
    
    public int next(int price) {
        int ans=1;
        while(st.size()>0 && st.peek()[0]<=price){
            ans=ans+st.pop()[1];
        }
        st.push(new int[]{price,ans});
        return ans;
    }
}

