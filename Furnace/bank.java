import java.util.*;

class BankAccount {
    private double balance; // account balance

    public BankAccount(double openingBalance) { // constructor
        balance = openingBalance;
    }

    public void deposit(double amount) {// makes deposit amount
        balance = balance + amount;
    }

    public void withdraw(double amount) {// makes withdraw amount
        balance = balance - amount;
    }

    public void display() { // display the account balance
        System.out.println("Balance = " + balance);
    }
}

class BankApp {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(100); // create account
        System.out.print("Before transaction, ");
        ba1.display(); // display the account balance
        ba1.deposit(74.35); // makes the account
        ba1.withdraw(20.00); // makes withdraw amount

        System.out.print("After transaction, ");
        ba1.display(); // display the account balance
    }
}