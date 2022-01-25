package JavaAssignments.Assigment5;

public class Singleton {
    String userName;
    static Singleton getInstance(String userName)
    {
        //this.userName=userName; // non-static variables cannot be accessed from static context
        Singleton singleton=new Singleton();
        return singleton;
    }

    void printUsername()
    {
        System.out.println("user name: "+userName);
    }

}
