package JavaAssignments;
import java.util.regex.*;
import java.util.Scanner;
import java.io.*;
public class Assigment1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("Enter the text file you want to search");
            String input = sc.nextLine();
            File currentDirectory = new File(".");
            File[] files = currentDirectory.listFiles();
            String pattern = input + ".txt";
            boolean found=false;
            for (File file : files) {
                if (Pattern.matches(pattern, file.getName())) {
                    System.out.println("File Found! at location: " + file.getAbsolutePath());
                    found=true;
                    break;
                }
            }
            if(!found)
            System.out.println("File not Found");

            System.out.println("Enter q to exit, or any character to continue");
            String temp=sc.nextLine();
            if(temp.equals("q"))
                break;
        }
    }
}
