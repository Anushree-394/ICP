package Assignment_9;
import java.util.*;
public class palindrome_ll {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public boolean isPalindrome(ListNode head) {
            ArrayList<Integer> li=new ArrayList<>();
            ListNode temp=head;
            while(temp!=null){
                li.add(temp.val);
                temp=temp.next;
            }
            int strt=0;
            int end=li.size()-1;
            while(strt<end){
                if(li.get(strt)!=li.get(end)){
                    return false;
                }
                strt++;
                end--;
            }
            return true;
        }
     
        
    }
}


