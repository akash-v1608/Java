package JavaAssignments.Assignment7;

public class Gerbil extends Rodent{
    Gerbil()
    {
        System.out.println("Gerbil class!");
    }
    @Override
    void eat() {
        System.out.println("Gerbil is eating");
    }

    @Override
    void play() {
            System.out.println("Gerbil is playing");
    }
}
