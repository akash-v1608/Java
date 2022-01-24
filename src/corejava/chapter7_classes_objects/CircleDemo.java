package corejava.chapter7_classes_objects;

public class CircleDemo {
    public static void main(String[] args)
    {
        Circle circle=new Circle();
        System.out.println("radius "+circle.getRadius());
        circle.setRadius(4);
        System.out.println("radius "+circle.getRadius());
        System.out.println("Circumference "+circle.circumference());
        System.out.println("area: "+circle.area());
    }
}
