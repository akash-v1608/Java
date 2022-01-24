package corejava.chapter4_arrays_arrayLists;
import java.util.*;

public class ParallelLists {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> namesList=new ArrayList<>();
        ArrayList<Integer> agesList=new ArrayList<>();

        for(int i=0;i<5;i++)
        {
            System.out.println("Enter person "+(i+1)+" name: ");
            String name=sc.next();
            System.out.println("Enter age of "+name+" ");
            int age=sc.nextInt();
            namesList.add(name);
            agesList.add(age);
        }

        for(int i=0;i<namesList.size();i++)
        {
            System.out.println(namesList.get(i)+" is "+agesList.get(i)+" years old");
        }
    }
}
