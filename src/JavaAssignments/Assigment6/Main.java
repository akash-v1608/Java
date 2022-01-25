package JavaAssignments.Assigment6;

public class Main {
    public static void main(String[] args)
    {
        ConstructorOverloading nonparameter=new ConstructorOverloading();
        ConstructorOverloading withparameter=new ConstructorOverloading("akash","12345","None");

        ConstructorDemo[] arr=new ConstructorDemo[3];
        for(int i=0;i<3;i++)
        {
            arr[i]=new ConstructorDemo(String.valueOf(i+1));
        }
    }
}
