package corejava.chapter4_arrays_arrayLists;
import java.util.*;
public class ArrayExample {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any five numbers");
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The resultant array after modification is ");
        for(Integer x:arr)
            System.out.print(x*2+" ");
    }
}
