package corejava.Chapter8_filesHandling_exceptions;

public class Circle {
    private  double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    Circle()
    {
        radius=1;
    }
    void setRadius(double radius)
    {
        this.radius=radius;
    }
    double getRadius()
    {
        return radius;
    }
    double area()
    {
        return (double)(Math.PI)*(double)Math.pow(radius,2);
    }
    double circumference()
    {
        return (double)(Math.PI)*(radius)*2;
    }


}
