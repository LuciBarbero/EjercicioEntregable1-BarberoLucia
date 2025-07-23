package org.example.Logica.PaymentTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.Logica.Payment.PaypalGateway;

public class PaypalGatewayTest {

    @Test
    public void testAuthorize() {
        PaypalGateway gateway = new PaypalGateway();
        boolean result = gateway.authorize(100.0);
        assertTrue(result);
    }

    @Test
    public void testCapture() {
        PaypalGateway gateway = new PaypalGateway();
        boolean result = gateway.capture(100.0);
        assertTrue(result);
    }
}