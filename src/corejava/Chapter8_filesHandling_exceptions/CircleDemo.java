package corejava.Chapter8_filesHandling_exceptions;
import java.io.*;
import java.util.*;
public class CircleDemo {
    public static void main(String[] args)
    {
        ArrayList<Circle> circles=new ArrayList<>();
        Circle temp;
        double radius;
        try
        {
            Scanner file=new Scanner(new File("circle_data.txt"));
            while(file.hasNext())
            {
                radius=file.nextDouble();
                temp=new Circle(radius);
                circles.add(temp);
            }
            file.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Desired file not found");
        }
        for(Circle circle:circles)
        {
            System.out.println("Radius: "+circle.getRadius());
            System.out.println("Area: "+circle.area());
            System.out.println("circumference: "+circle.circumference());
            System.out.println();
        }
    }

}
