package JavaAssignments;

import java.util.regex.*;
import java.util.Scanner;

public class Assigment9{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        String rule="[A-Z].*[.]";
        Pattern pattern = Pattern.compile(rule);
        System.out.println("Enter input text");
        Matcher matcher = pattern.matcher(sc.nextLine());
        if(matcher.matches())
            System.out.println("Your input matches the given pattern");
        else
            System.out.println("Your input does not match the given pattern");

    }
}

//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