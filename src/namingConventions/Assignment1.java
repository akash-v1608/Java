package namingConventions;

import java.util.*;
public class Assignment1{
    static final int INVALID_OPERATION = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input Text");
        String inputText = sc.next();
        System.out.println("Select any one of the following operations: 1) append 2)findIndex 3)reverse ");
        String operation = sc.next();
        switch (operation) {
            case "reverse":
                Reverse reverse = new Reverse();
                reverse.reverseString(inputText);
                break;
            case "append":
                System.out.println("Enter String to be appended ");
                String nextWord = sc.next();
                Append append = new Append();
                append.appendString(inputText, nextWord);
                break;
            case "findIndex":
                System.out.println("Enter target String to match");
                String targetText = sc.next();
                FindIndex find= new FindIndex();
                find.findIndex(inputText, targetText);
                break;
            default:
                System.out.println("invalid operation: " + INVALID_OPERATION);
        }

    }
}

