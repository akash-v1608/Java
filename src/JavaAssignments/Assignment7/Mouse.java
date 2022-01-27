package JavaAssignments.Assignment7;

public class Mouse extends Rodent{
    Mouse()
    {
        System.out.println("Mouse class");
    }

    @Override
    void eat() {
        System.out.println("Mouse is eating");
    }

    @Override
    void play() {
        System.out.println("Mouse is playing");
    }
}
