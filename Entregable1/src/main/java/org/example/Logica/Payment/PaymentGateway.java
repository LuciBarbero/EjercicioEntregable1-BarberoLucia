package org.example.Payment;

public interface PaymentGateway {

    boolean authorize(double amount);
    boolean capture(double amount);

}
