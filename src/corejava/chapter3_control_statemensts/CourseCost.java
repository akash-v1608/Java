package corejava.chapter3_control_statemensts;
import java.util.*;
public class CourseCost {
    public static void main(String[] args)
    {
        int baseCost=0;
        int coursesIncluded=0;
        int additionalCost=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter which package do you want to purchase?  1 or 2 or 3");
        int packages=sc.nextInt();
        System.out.println("Enter number of courses, do you want to purchase");
        int courses=sc.nextInt();
        int cost=0;

        if(packages==1)
        {
            baseCost=10;
            coursesIncluded=2;
            cost=getTotalCost(baseCost,coursesIncluded,courses,additionalCost);

        }
        else if(packages==2)
        {
            baseCost=12;
            coursesIncluded=4;
            additionalCost=4;
            cost=getTotalCost(baseCost,coursesIncluded,courses,additionalCost);
        }
        else if(packages==3)
        {
            baseCost=15;
            coursesIncluded=6;
            additionalCost=3;
            cost=getTotalCost(baseCost,coursesIncluded,courses,additionalCost);
        }

        System.out.println("total Cost is: "+cost);
    }


    static int getTotalCost(int baseCost,int coursesIncluded,int courses,int additionalCost) {
        int cost = 0;
        if (courses > coursesIncluded) {
            cost = baseCost + (courses - coursesIncluded) * additionalCost;
        } else
            cost = baseCost;

        return cost;
    }
}
