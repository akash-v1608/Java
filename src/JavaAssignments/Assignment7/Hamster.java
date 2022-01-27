package JavaAssignments.Assignment7;

public class Hamster extends Rodent{
    Hamster()
    {
        System.out.println("Hamster class!");
    }
    @Override
    void eat() {
        System.out.println("hamster is eating");
    }

    @Override
    void play() {
        System.out.println("Hamster is playing");

    }
}
