package JavaAssignments;

import java.util.*;
class Assignment2{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String inputText=sc.next();
        if(checkString(inputText))//method checkString checks whether the string contains all the alphabets or not.
            System.out.println("Given string consists all the letters from a-z");
        else
            System.out.println("Given string does not contain all the letters from a-z");
    }

    static boolean checkString(String inputText)
    {
        int[] frequency=new int[26];
        for(int i=0;i<inputText.length();i++)
        {
            char ch=inputText.charAt(i);
            if(ch>='A' && ch<='Z')
                frequency[ch-'A']++;
            else
                frequency[ch-'a']++;
        }

        for(int i=0;i<26;i++)
        {
            if(frequency[i]==0)
                return false;
        }
        return true;
    }
}