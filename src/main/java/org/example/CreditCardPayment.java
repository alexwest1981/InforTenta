package org.example;

public class CreditCardPayment implements Payable {
    private String status = "Pending";

    @Override
    public void pay(double amount) {
        System.out.println("Betalar " + amount + " SEK med kreditkort...");
        this.status = "Completed";
    }
    public String checkStatus() {
        return this.status;
    }
}
