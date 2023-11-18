package Exercise1;

public class CurrentAccount extends BankAccount{
    @Override
    protected void deposit(int amount) {
        balance += amount;
    }

    @Override
    protected void withdraw(int amount) {
        balance -= amount;
        if(balance < 150)
            System.out.println("Warning!!!\nYour balance is getting low.\nCurrent balance is " + balance);
    }

}
