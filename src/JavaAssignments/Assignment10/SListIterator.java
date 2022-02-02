package JavaAssignments.Assignment10;

public class SListIterator<t> {
    SLNode<t> node;
    SListIterator(SLNode<t> node)
    {
        this.node=node;
    }
    public void add(t data){
        SLNode<t> newnode = new SLNode(data,null);
        node.next= newnode;
        node=node.next;
    }
    public void pop(SLNode<t> head){
        if(head==null)
            return;
        while(head.next!=null && head.next.next != null){
            head = head.next;
        }
        head.next = null;
        node=head;
    }
    public SLNode<t> next(){
        node = node.next;
        return node;
    }
    public boolean hasNext(){
        return node.next!=null;
    }

}
