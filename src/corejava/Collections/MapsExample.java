package corejava.Collections;
import java.util.*;
public class MapsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of input");
        int size=sc.nextInt();
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter name: ");
            String name=sc.next();
            System.out.println("Eeter section: ");
            String section=sc.next();
            ArrayList<String> list;
            if(map.containsKey(section)) {
                list = map.get(section);
            }
            else
            {
                list=new ArrayList<>();
            }
            list.add(name);
            map.put(section,list);
        }
        TreeMap<String,ArrayList<String>> tmap=new TreeMap<>(map);

        while(true)
        {
            System.out.println("Enter 1)to display names classWise /n 2)to display names classWise in sorted order");
            int operation=sc.nextInt();
            if(operation==1)
            {
                for(Map.Entry<String,ArrayList<String>> e:map.entrySet())
                {
                    System.out.println(e.getKey());
                    for(String s:e.getValue())
                        System.out.println(s);
                }
            }
            else
            {
                for(Map.Entry<String,ArrayList<String>> e:tmap.entrySet())
                {
                    System.out.println(e.getKey());
                    for(String s:e.getValue())
                        System.out.println(s);
                }
            }
        }


    }
}
