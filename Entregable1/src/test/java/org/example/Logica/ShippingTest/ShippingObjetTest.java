package org.example.Logica.ShippingTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.Logica.Shipping.*;

public class ShippingObjetTest {

    @Test
    public void testGetters() {
        Dimensions dim = new Dimensions(1, 2, 3);
        ShippingObjet request = new ShippingObjet(10.5, dim, "Origen", "Destino");

        assertEquals(10.5, request.getWeight(), 0.0001);
        assertEquals(dim, request.getDimensions());
        assertEquals("Origen", request.getOrigin());
        assertEquals("Destino", request.getDestination());
    }
}