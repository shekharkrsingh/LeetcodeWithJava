class MinStack {
    Node head;
    public MinStack() {
        head =null;
    }
    
    public void push(int val) {
        if(head==null){
            head=new Node(val,val,null);
        }else{
            head = new Node(Math.min(val,head.min),val,head);
        }
    }
    
    public void pop() {
        head=head.next;
    }
    
    public int top() {
        return head.value;
    }
    
    public int getMin() {
        return head.min;
    }
}

public class Node{
    int min;
    int value;
    Node next;

    Node(int m,int v,Node n){
        this.min = m;
        this.value =v;
        this.next= n;
    }
}