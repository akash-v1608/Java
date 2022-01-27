package JavaAssignments.Assignment11;
import java.io.*;
import java.util.*;
public class Frequency {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc=new Scanner(new File(args[0]));
        PrintWriter writer=new PrintWriter("output.txt");
        HashMap<Character,Integer> m=new HashMap<>();
        while(sc.hasNext())
        {
            String s=sc.next();
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                m.put(ch,m.getOrDefault(ch,0)+1);
            }
        }

        for(Map.Entry<Character,Integer> e:m.entrySet())
        {
            writer.println(e.getKey()+": "+ e.getValue());
        }

        writer.close();
        sc.close();

    }
}
