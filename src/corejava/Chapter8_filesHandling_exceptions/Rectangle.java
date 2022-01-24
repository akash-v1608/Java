package corejava.Chapter8_filesHandling_exceptions;

public class Rectangle {
    private double length;
    private double width;
    Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    double getLength()
    {
        return length;
    }
    double getWidth()
    {
        return width;
    }
    double area()
    {
        return length*width;
    }
    double perimeter()
    {
        return 2*(length+width);
    }
}
