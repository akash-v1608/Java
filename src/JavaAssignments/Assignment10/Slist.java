package JavaAssignments.Assignment10;

public class Slist<t>{
    SLNode<t> dummy=new SLNode<>(null,null);


    public SListIterator<t> iterator() {
        return new SListIterator<t>(dummy);
    }
    public String toString(){
        if(dummy== null){
            return "Empty";
        }else{
            SListIterator<t> iterator = this.iterator();
            StringBuilder sb = new StringBuilder();
            while(iterator.hasNext()){
                sb.append(iterator.next()+ ", ");
            }
            return sb.toString();
        }
    }
    public SLNode<t> getDummy()
    {
        return dummy;
    }
}
