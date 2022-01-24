package corejava.Collections;
import java.util.*;
public class Lists {
    public static void main(String[] args)
    {
        //example for LinkedList

        LinkedList<Integer>  numbers=new LinkedList<>();
        for(int i=0;i<10;i++)
        {
            numbers.add(i);
        }

        //display size of linkedlist
        System.out.println("the size of the linked list is "+numbers.size());

        //removing elements from linkedlist
        numbers.pop(); //removed 0
        numbers.pop();//removed 1

        //add elements into linkedlist
        numbers.add(11); //added 11 at the end
        numbers.add(12);
        Iterator<Integer> it= numbers.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next()*2);
        }
    }
}
