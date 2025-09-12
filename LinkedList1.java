public class LinkedList1 {
     ListNode head;
    public class ListNode{
        int data;
        ListNode next;

        ListNode(int x){
            this.data=x;
            this.next=null;

        }
    } 
    public void addnth(int x,int n){
        ListNode temp=new ListNode(x);
        ListNode curr=head;
        if(n==0){
            temp.next=head;
            head=temp;
            return;
        }
       
        while(n>1){
            curr=curr.next;
            n--;
        }
        ListNode dummy=curr.next;
        curr.next=temp;
        temp.next=dummy;

    }
    public void addend(int x){
        ListNode temp=new ListNode(x);
        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
    }
    public void removeFromLast(int n){
        ListNode temp=head;
        ListNode curr=head;
        while(n>0){
            curr=curr.next;
            n--;
        }
        while(curr.next!=null){
            curr=curr.next;
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    public void print(){
        ListNode curr=head;
        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println("null");
        
    }
    public static void main(String[] args) {
        LinkedList1 ll=new LinkedList1();
        
        ll.addnth(1,0);
        ll.addnth(55,1);
        ll.addnth(10,2);
        ll.addnth(66,1);
        ll.addnth(77,2);
        ll.addnth(22,4);
        ll.addend(99);
        ll.removeFromLast(2);
        ll.print();

    }
}
