package corejava.Chapter6_Methods;
import java.util.*;
public class Sum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers into ArrayLists");
        System.out.println("To stop entering enter exit");
        ArrayList<Integer> numbers=new ArrayList<>();
        int count=0;
        while(true)
        {
            System.out.println("do you want continue (y/n): ");
            String decision=sc.next();
            if(decision.equals("n"))
                break;
            else
            {
                count++;
                System.out.println("Enter "+count+" number: ");
                int num=sc.nextInt();
                numbers.add(num);
            }
        }

        System.out.println("The sum of entered numbers is "+findSum(numbers,count));
    }
    static int findSum(ArrayList<Integer> numbers,int count)
    {
        int sum=0;
        for(Integer x:numbers)
            sum+=x;

        return sum;
    }
}
