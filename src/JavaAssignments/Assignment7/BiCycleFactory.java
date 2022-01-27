package JavaAssignments.Assignment7;

public class BiCycleFactory implements CycleFactory{

    @Override
    public void startFactory() {
        runFactory();
    }

    @Override
    public void runFactory() {
        System.out.println("welcome to BicycleFactory");
    }
}
