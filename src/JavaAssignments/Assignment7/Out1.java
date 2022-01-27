package JavaAssignments.Assignment7;

public class Out1 {
    Out1()
    {
        System.out.println("inside constructor of outer class 1");
    }
    public class In1
    {
        In1()
        {
            System.out.println("inside constructor of inner class 1");
        }
    }
}
