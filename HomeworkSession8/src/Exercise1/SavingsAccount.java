package Exercise1;

import java.util.Scanner;

public class SavingsAccount extends BankAccount{
    @Override
    protected void deposit(int amount) {
        balance += amount;
    }

    @Override
    protected void withdraw(int amount) {
        if(balance - amount > 150)
            balance -= amount;
        else {
            System.out.println("Cannot carry on with operation. Balance will be below 150. Are you sure you want to withdraw?\n y/n");
            Scanner scanner = new Scanner(System.in);
            char yesNo = scanner.next().charAt(0);
            if (yesNo == 'y')
                balance -= amount;
        }
    }
}
