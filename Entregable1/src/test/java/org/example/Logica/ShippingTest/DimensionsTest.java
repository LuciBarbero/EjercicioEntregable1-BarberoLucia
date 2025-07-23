package org.example.Logica.ShippingTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.Logica.Shipping.*;

public class DimensionsTest {

    @Test
    public void testGetVolume() {
        Dimensions dim = new Dimensions(2, 3, 4);
        assertEquals(24.0, dim.getVolume(), 0.0001);
    }
}