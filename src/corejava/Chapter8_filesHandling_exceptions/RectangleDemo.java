package corejava.Chapter8_filesHandling_exceptions;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RectangleDemo {
    public static void main(String[] args)
    {
        ArrayList<Rectangle> rectangles=new ArrayList<>();

        try {
            Scanner file=new Scanner(new File("rectangle_data.txt"));
            while (file.hasNext()) {
                Rectangle temp;
                double length;
                double width;
                length = file.nextDouble();
                width = file.nextDouble();
                temp = new Rectangle(length, width);
                rectangles.add(temp);
            }
           file.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Desired file not found");
        }

        PrintRectangleData(rectangles);
    }

    private static void PrintRectangleData(ArrayList<Rectangle> rectangles) {
        for(Rectangle rectangle:rectangles)
        {
            System.out.println("Length: "+rectangle.getLength());
            System.out.println("width: "+rectangle.getWidth());
            System.out.println("area: "+rectangle.area());
            System.out.println("perimeter: "+rectangle.perimeter());
            System.out.println();
        }
    }

}
