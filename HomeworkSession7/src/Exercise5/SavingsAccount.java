package HomeworkSession7.Exercise5;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(double balance) {
        super(balance);
    }


    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 100)
            super.withdraw(amount);
    }


}
