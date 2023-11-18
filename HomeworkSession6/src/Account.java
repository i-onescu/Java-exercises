package HomeworkSession6;

public class Account {
    private String name;
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount) {
        balance = balance + amount;
    }

    public void debit(double amount) {
        balance = balance - amount;
    }

    public void transferTo(Account anotherAccount, double amount) {
        anotherAccount.balance += amount;
        balance -= amount;
    }

    public void showBalance() {
        if (name != null)
            System.out.println("Account name: " + name);
        System.out.println("Balance: " + balance + "\n");
    }
}