package JavaAssignments.Assignment7;

public class Main {
    public static void main(String[] args)
    {
      Rodent[] rodents=new Rodent[3];
        rodents[0]=new Hamster();
        rodents[0].eat();
        rodents[0].play();

        rodents[1]=new Gerbil();
        rodents[1].eat();
        rodents[1].play();

        rodents[2]=new Mouse();
        rodents[2].eat();
        rodents[2].play();



        Cycle unicycle=new Unicycle();
        Cycle bicycle=new Bicycle();
     /*  Cycle tricycle=new Tricycle() {
            @Override
            void balance() {

            }
        };*/
        //unable to create a newinstance of tricycle and upcast it to Cycle because it does not implement
        //all the abstract methods of Cycle.

        unicycle.balance();
        bicycle.balance();
       // tricycle.balance();


        //downcasting
        Unicycle unicycle1=(Unicycle) unicycle;
        unicycle1.balance();




        Account account=new Account();
        Account1 account1=new Account();
        Account2 account2=new Account();
        Account3 account3=new Account();
        account.getAccount1(account1);
        account.getAccount2(account2);
        account.getAccount3(account3);
        account.getAccount4(account);


        CycleFactory cycle=new BiCycleFactory();
        cycle.startFactory();
        cycle=new UniCycleFactory();
        cycle.startFactory();
        cycle=new TriCycleFactory();
        cycle.startFactory();

        Out2.In2 inner2=new  Out2().new In2();

    }
}
