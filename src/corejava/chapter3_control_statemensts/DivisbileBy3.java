package corejava.chapter3_control_statemensts;
import java.util.*;
public class DivisbileBy3{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        if(num%3==0)
            System.out.println("The given number is divisble by 3");
        else
            System.out.println("the given number is not divisinle by 3");
    }
}
