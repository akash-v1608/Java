package JavaAssignments.Assigment5;

public class Data {

    int instanceNumber;   // instance variables have default intialization
    char instanceCharacter;
    void printInstanceVariables()
    {
        System.out.println("Num: "+instanceNumber+"\n"+"Character: "+instanceCharacter);
    }
    void printLocalVariables()
    {
        int localNumber;
        char localCharacter;
        /*
           System.out.println("Local Number "+localNumber);
           System.out.println("Local Character "+localCharacter);

           Local variables unlike instance they don't have default intialization,
           so to use them we need to intialize them.
         */
    }

}
