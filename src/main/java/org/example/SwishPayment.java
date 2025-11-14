package org.example;

public class SwishPayment extends OnlinePayment {
    @Override
    public void validateCredentials() {
        System.out.println("Validating Swish credentials...");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + "SEK instantly via Swish!");
    }

    @Override
    public String checkStatus() {
        return "Payment succesful via Swish! TID: " + getTransactionId();
    }
}
