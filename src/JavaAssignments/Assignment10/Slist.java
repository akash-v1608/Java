package JavaAssignments.Assignment10;

public class Slist<t>{
    SLNode<t> head;


    public SListIterator<t> iterator() {
        return new SListIterator<t>(head);
    }
    public String toString(){
        String res="";
        if(head!=null){
            SListIterator<t> iterator = this.iterator();

            while(iterator.hasNext()){
                res+=iterator.next()+" ";
            }

        }
        return res;
    }
}
