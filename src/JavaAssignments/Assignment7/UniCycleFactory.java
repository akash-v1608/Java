package JavaAssignments.Assignment7;

public class UniCycleFactory implements CycleFactory {


    @Override
    public void startFactory() {
            runFactory();
    }

    @Override
    public void runFactory() {
            System.out.println("Welcome to unicycle factory");
    }
}
