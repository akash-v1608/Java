package corejava.chapter7_classes_objects;

public class BankAccountDemo {
    public static void main(String[] args)
    {
        BankAccount account=new BankAccount("akash",1000);
        System.out.println(account.getOwner());
        account.deposit(500);
        System.out.println(account.getBalance());
        account.withdraw(1000);
        System.out.println(account.getBalance());

        account.withdraw(1000);

    }
}
