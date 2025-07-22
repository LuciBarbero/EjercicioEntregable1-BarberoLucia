package org.example.Logica.Payment;

public class PaymentManager {

    public boolean processPayment(PaymentObjet request) {
        PaymentProcessor processor;

        switch (request.getProvider()) {
            case "paypal":
                processor = new PaypalPaymentProcessor(new PaypalGateway());
                break;
            case "mercadopago":
                processor = new MercadoPagoPaymentProcessor(new MercadoPagoGateway());
                break;
            default:
                throw new IllegalArgumentException("Proveedor no soportado: " + request.getProvider());
        }

        return processor.processPayment(request.getAmount());
    }

}
