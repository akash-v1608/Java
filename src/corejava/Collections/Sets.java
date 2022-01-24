package corejava.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;
public class Sets {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HashSet<String> set=new HashSet<>();
        ArrayList<Node> arr=new ArrayList<>();
        System.out.println("Enter Size");
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            System.out.println("ente name: ");
            String name=sc.next();
            System.out.println("Enter age: ");
            int age=sc.nextInt();
            System.out.println("Enter city: ");
            String city=sc.next();
            Node newnode=new Node(name,age,city);
            arr.add(newnode);
        }
        for(Node node:arr)
            set.add(node.city);

        TreeSet<String> tset=new TreeSet<>(set);
while(true) {
    System.out.println("Enter 1)to find unique city names \n 2)to find unique city names in ascending order");
    int operation = sc.nextInt();
    Iterator<String> it;
    if (operation == 1) {
        it = set.iterator();

    } else if(operation==2)
        it = tset.iterator();
    else
        break;

    while (it.hasNext()) {
        System.out.println(it.next());
    }
}
    }
}
class Node
{
    String name;
    int age;
    String city;
    Node(String name,int age,String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }
}
