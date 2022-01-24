package corejava.chapter5_Strings;
import java.util.*;
public class NamePermutation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> firstName=new ArrayList<>();
        ArrayList<String> lastName=new ArrayList<>();
        for(int i=1;i<6;i++)
        {
            System.out.println("Enter "+i+" name: ");
            String fullName=sc.nextLine();
            String[] fullNameSplit=fullName.split(" ");
            firstName.add(fullNameSplit[0]);
            lastName.add(fullNameSplit[1]);
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println(firstName.get(i)+" "+lastName.get(j));
            }
        }
    }
}
