package JavaAssignments.Assignment7;

public class TriCycleFactory implements CycleFactory{

    @Override
    public void startFactory() {
            runFactory();
    }

    @Override
    public void runFactory() {
        System.out.println("Welcome to TriCycleFactiory");
    }
}
