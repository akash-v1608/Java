package JavaAssignments.Assigment6;

public class ConstructorOverloading {
    private String userName;
    private String password;
    //Non-parametarized Constructor
    ConstructorOverloading()
    {
        this("akash velagala","12345","sent from Non-parameter constructor");
    }
    ConstructorOverloading(String userName,String password,String message)
    {
        this.userName=userName;
        this.password=password;
        System.out.println(message);
    }
}
