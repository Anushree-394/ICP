package Daily_Class_work.Day_12;

public class LL {
    
    class Node {
		int val;
		Node next;
        Node(int val){
            this.val=val;
            this.next=null;
            size++;
        }
       
	}
    LL(){
        this.size=0;
    }
     private Node head;
     private int size;

    public void AddFirst(int item) {
		Node nn = new Node(item);
		
		if (head==null) {
			head = nn;
			return;
		} 
        nn.next=head; //new node aage rkhdi head peeche
        head=nn; //abh jo nyi node hai usko head declare kiya


	}
    public void Deletefirst(){
         if(head==null){
            System.err.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void Deletelast(){
         if(head==null){
            System.err.println("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node seclast=head;
        Node last=head.next;
        while(last.next!=null){
            last=last.next;
            seclast=seclast.next;

        }
        seclast.next=null;
    }
    public void AddLast(int item) {
		Node nn = new Node(item);
        if (head==null) {
			head = nn;
			return;
		} 
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=nn;
		
		
        

	}
    public void display(){
        if(head==null){
            System.err.println("list is empty");
            return;
        }
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.val+" -> ");
            curr=curr.next;
        }
        System.out.println("NULL");
    }
    public  int getSize(){
        return size;
    }


    public static void main(String[] args){
        LL list=new LL();
        list.AddFirst(12);
        list.AddFirst(15);
        list.display();
        list.AddLast(78);
        list.display();
        list.Deletefirst();
        list.display();
        list.Deletelast();
        list.display();
         list.AddFirst(12);
        list.AddFirst(15);
        System.out.println(list.getSize());
    }
   

	
}
