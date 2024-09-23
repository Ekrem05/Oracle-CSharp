public class BankAccount {

    private double balance;


    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to the bank. Current balance is " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient funds to withdraw.");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from the bank. Current balance is " + balance);
        }
    }
}
