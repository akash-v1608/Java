package corejava.Collections;
import java.util.*;
public class PriorityQueueExamplee{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq=new PriorityQueue();
        pq.offer(5);
        pq.offer(1);
        pq.add(2);
        pq.add(0);
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(5);
        maxHeap.add(1);
        maxHeap.add(0);
        maxHeap.add(2);
        while(pq.size()>0)
        {
            System.out.println(pq.poll());
        }
        System.out.println("max heap");
        while(maxHeap.size()>0)
        {
            System.out.println(maxHeap.poll());
        }

    }
}
