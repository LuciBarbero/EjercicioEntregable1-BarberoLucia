package org.example.Logica.Payment;

public interface PaymentGateway {

    boolean authorize(double amount);
    boolean capture(double amount);

}
