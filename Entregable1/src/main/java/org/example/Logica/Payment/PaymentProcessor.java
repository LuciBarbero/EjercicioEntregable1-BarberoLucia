package org.example.Logica.Payment;

public abstract class  PaymentProcessor {

        protected PaymentGateway gateway;

        public PaymentProcessor(PaymentGateway gateway) {
                this.gateway = gateway;
        }

        public abstract boolean processPayment(double amount);

        public abstract boolean refundPayment(double amount);
}