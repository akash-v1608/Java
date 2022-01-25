package JavaAssignments.Assigment5;

public class Main {
    public static void main(String[] args)
    {
        Data data=new Data();
        data.printInstanceVariables();
        data.printLocalVariables(); // fails, because local variables are not intialized;

        Singleton singleton=new Singleton();
        singleton=singleton.getInstance("akash"); // fails because tried to access non static from static context.
        singleton.printUsername();
    }
}
