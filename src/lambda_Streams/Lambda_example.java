package lambda_Streams;
 class Lambda_example {
        public static void main(String args[])
        {

            new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    System.out.println("New thread created");
                }
            }).start();
        }

}

// with lambdas
/*

class Test
{
  public static void main(String args[])
  {
    new Thread(()->
       {System.out.println("New thread created");}).start();
  }
}

 */


//default methods in interface
/*
public interface Vehicle {
    void cleanVehicle();
    default void startVehicle() {
        System.out.println("Vehicle is starting");
    }
}

//static methods in interface
//functional interface
public interface Vehicle {
    static void cleanVehicle(){
        System.out.println("I am cleaning vehicle");
    }
    void repairVehicle();
}


//multiple inheritance behaviour
public interface A{
    public default void printUsingA(){
        System.out.println("Print from A");
    }
}
//B.java
public interface B{
    public default void printUsingB(){
        System.out.println("Print from B");
    }
}
//C.java
public class C implements A,B{
    public static void main(String args[]){
        C cObj=new C();
        cObj.printUsingA();
        cObj.printUsingB();
    }
}

 */