package JavaAssignments.Assignment10;

public class Main {
    public static void main(String[] args)
    {
            Slist<String> cities=new Slist<>();
            SListIterator<String> iterator=cities.iterator();
            SLNode<String> dummy=cities.getDummy();
            SLNode<String> head=dummy.next;
            iterator.add("hyderabad");
            iterator.add("mumbai");
            iterator.add("chennai");
            iterator.add("pune");
            iterator.pop(dummy.next);
           // iterator.add("delhi");
            iterator.pop(dummy.next);
            System.out.println(cities.toString());
    }
}
