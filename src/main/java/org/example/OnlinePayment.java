package org.example;

public abstract class OnlinePayment implements Payable {

    private String transactionId = "TID12345";

    public String getTransactionId() {
        return this.transactionId;
    }

    public abstract void validateCredentials();

    @Override
    public abstract void pay(double amount);
    @Override
    public abstract String checkStatus();
}
