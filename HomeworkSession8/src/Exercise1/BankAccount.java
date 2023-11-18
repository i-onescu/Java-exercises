package Exercise1;

public abstract class BankAccount {

    protected int balance;

    protected abstract void deposit(int amount);
    protected abstract void withdraw(int amount);

}
