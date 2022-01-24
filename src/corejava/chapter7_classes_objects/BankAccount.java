package corejava.chapter7_classes_objects;

public class BankAccount {
    private String owner;
    private int balance;
    BankAccount(String owner)
    {
        this.owner=owner;
    }
    BankAccount(String owner,int balance)
    {
        this.owner=owner;
        this.balance=balance;
    }
    String getOwner()
    {
        return this.owner;
    }
    int getBalance()
    {
        return balance;
    }
    void deposit(int amount)
    {
        this.balance+=amount;
    }
    void withdraw(int amount)
    {
        if(balance<amount)
        {
            System.out.println("Insufficient balance");
        }
        else
            balance-=amount;
    }
}
