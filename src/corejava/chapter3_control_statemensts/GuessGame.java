package corejava.chapter3_control_statemensts;
import java.util.*;

public class GuessGame {
    public static void main(String[] args)
    {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int target=random.nextInt(100);
        boolean flag=false;
        int count=0;
        System.out.println("targets is "+target);
        while(!flag)
        {
            System.out.println("Enter a your number: ");
            int num=sc.nextInt();
            if(num>=1 && num<=100)
            {
                if(num==target)
                {
                    System.out.println("You have succesfully found the number after "+count+" attempts");
                    flag=true;
                }
                else if(num<target)
                {
                    System.out.println("your guess is too low");
                }
                else
                {
                 System.out.println("your guess is to high");
                }
            }
            else
            {
                System.out.println("Your number does not lie in the specified range");
            }

            count++;
        }
    }
}
