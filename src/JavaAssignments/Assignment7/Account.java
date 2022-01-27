package JavaAssignments.Assignment7;

public class Account implements Account4{
    @Override
    public void setName1() {
         System.out.println("Account1 username");
    }

    @Override
    public void getName1() {
        System.out.println("Account1 username");
    }

    @Override
    public void setName2() {
        System.out.println("Account2 username");
    }

    @Override
    public void getName2() {
        System.out.println("Account2 username");
    }

    @Override
    public void setName3() {
        System.out.println("Account3 username");
    }

    @Override
    public void getName3() {
        System.out.println("Account3 username");
    }

    @Override
    public void integrate() {
        System.out.println("All 3 interfaces are integrated");
    }

    void getAccount1(Account1 account)
    {
        account.getName1();
    }
    void getAccount2(Account2 account)
    {
        account.getName2();
    }
    void getAccount3(Account3 account)
    {
        account.getName3();
    }
    void getAccount4(Account4 account)
    {
        account.integrate();
    }
}
