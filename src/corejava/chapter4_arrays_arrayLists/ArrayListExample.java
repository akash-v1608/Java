package corejava.chapter4_arrays_arrayLists;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter a negative number to stop the loop");
        while(!flag)
        {
            System.out.println("Enter a  number to add into list");
            int num=sc.nextInt();
            if(num<0) {
                System.out.println("ALl the numbers are succesfully stored in ArrayList");
                flag = true;
            }
            else
                list.add(num);
        }

        if(list.size()>0)
        {
            int len=list.size();
            for(int i=len-1;i>=0;i--)
            {
                System.out.print(list.get(i)+" ");
            }
        }


    }
}
