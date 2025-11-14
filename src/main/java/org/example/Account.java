package org.example;

public class Account {
    private double balance;

    public Account() {
        balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount >0) {
            balance += amount;
        } else  {
            System.out.println("Amount is negative");
        }
    }
}
