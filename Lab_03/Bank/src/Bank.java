import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(double initialBalance, String customerName) {
        BankAccount account = new BankAccount(initialBalance, customerName);
        accounts.add(account);
    }

    public BankAccount find(int accountNumber) {
        for (BankAccount ba : this.accounts) {
            if (ba.getAccountNumber() == accountNumber)
                return ba;
        }
        return null;
    }

    public void deposit(int accountNumber, double amount) {
        BankAccount account = find(accountNumber);
        if (account != null){
            account.deposit(amount);
        }
    }

    public void withdraw(int accountNumber, double amount) {
        BankAccount account = find(accountNumber);
        if (account != null){
            account.withdraw(amount);
        }
    }

    public double getBalance(int accountNumber) {
        BankAccount account = find(accountNumber);
        if (account != null){
            return account.getBalance();
        }
        return 0;
    }

    public void transfer(int fromAccountNumber, int toAccountNumber, double amount) {
        BankAccount from = find(fromAccountNumber);
        BankAccount to = find(toAccountNumber);
        if(from != null && to != null){
            from.withdraw(amount);
            to.deposit(amount);
        }
    }
}