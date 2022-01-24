package JavaAssignments;
import java.util.regex.*;
import java.util.Scanner;
import java.io.*;
public class Assigment1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text file you want to search");
        String input=sc.nextLine();
        File currentDirectory=new File(".");
        File[] files=currentDirectory.listFiles();
        String pattern=input+".txt";
        if(files!=null) {
            for (File file : files) {
                if (Pattern.matches(pattern, file.getName())) {
                    System.out.println("File Found! at location: "+file.getAbsolutePath());
                    return;
                }
            }
        }
        System.out.println("File not Found");
    }
}
