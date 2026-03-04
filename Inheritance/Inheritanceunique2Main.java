// Parent Class
class Account {
    String accountHolder;
    double balance;

    Account(String name, double bal) {
        accountHolder = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited.");
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Child Class 1
class SavingsAccount extends Account {
    double interestRate = 5.0;

    SavingsAccount(String name, double bal) {
        super(name, bal);
    }

    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

// Child Class 2
class CurrentAccount extends Account {
    double overdraftLimit = 1000;

    CurrentAccount(String name, double bal) {
        super(name, bal);
    }

    void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn.");
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

// Main Class
public class Inheritanceunique2Main {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("Danush", 10000);
        sa.deposit(2000);
        sa.addInterest();
        sa.displayBalance();

        System.out.println();

        CurrentAccount ca = new CurrentAccount("John", 5000);
        ca.withdraw(5500);
        ca.displayBalance();
    }
}