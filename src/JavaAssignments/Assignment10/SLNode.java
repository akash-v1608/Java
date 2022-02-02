package JavaAssignments.Assignment10;

public class SLNode <t>{

    t data;
    SLNode next;
    SLNode(t data,SLNode next)
    {
        this.data=data;
        this.next=next;
    }
    public String toString() {
        if(data != null){
            return data.toString();
        }
        return null;
    }
}
