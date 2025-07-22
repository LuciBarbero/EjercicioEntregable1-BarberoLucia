package org.example.Payment;

public class PaymentObjet {

    private double amount;
    private String provider;

    public PaymentObjet(double amount, String provider) {
        this.amount = amount;
        this.provider = provider;
    }

    public double getAmount() {
        return amount;
    }

    public String getProvider() {
        return provider;
    }
}
