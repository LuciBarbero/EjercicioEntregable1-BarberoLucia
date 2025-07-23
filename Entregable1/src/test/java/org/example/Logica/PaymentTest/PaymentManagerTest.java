package org.example.Logica.PaymentTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Logica.Payment.*;

public class PaymentManagerTest {

    @Test
    public void testProcessPayment_Paypal() {
        PaymentObjet request = new PaymentObjet(150, "paypal");
        PaymentManager manager = new PaymentManager();

        boolean result = manager.processPayment(request);

        assertTrue(result);
    }

    @Test
    public void testProcessPayment_MercadoPago() {
        PaymentObjet request = new PaymentObjet(250, "mercadopago");
        PaymentManager manager = new PaymentManager();

        boolean result = manager.processPayment(request);

        assertTrue(result);
    }

    @Test
    public void testProcessPayment_InvalidProvider() {
        PaymentObjet request = new PaymentObjet(100, "otro");
        PaymentManager manager = new PaymentManager();

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                manager.processPayment(request));

        assertEquals("Proveedor no soportado: otro", exception.getMessage());
    }
}