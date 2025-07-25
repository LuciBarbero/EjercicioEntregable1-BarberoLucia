package org.example.Logica.Payment;

public class MercadoPagoGateway implements PaymentGateway {
    @Override
    public boolean authorize(double amount) {
        System.out.println("[MercadoPago Gateway] Autorizando pago de $" + amount); //VERRR
        return true;
    }

    @Override
    public boolean capture(double amount) {
        System.out.println("[MercadoPago Gateway] Capturando pago de $" + amount); //VERRR
        return true;
    }
}
