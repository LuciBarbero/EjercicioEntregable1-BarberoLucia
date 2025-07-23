package org.example.Logica.PaymentTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Logica.Payment.*;

public class PaymentObjetTest {

    @Test
    public void testConstructorAndGetters() {
        PaymentObjet request = new PaymentObjet(150.0, "paypal");

        assertEquals(150.0, request.getAmount());
        assertEquals("paypal", request.getProvider());
    }
}