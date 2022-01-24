package corejava.chapter2;

import java.util.Scanner;

public class AverageOf3 {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter any three numbers to get average");
         double num1=sc.nextDouble();
         double num2=sc.nextDouble();
         double num3=sc.nextDouble();

         double avg=(num1+num2+num3)/3;
         System.out.println(avg);
    }
}
