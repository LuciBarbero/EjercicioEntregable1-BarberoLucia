package org.example.Logica.ShippingTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.Logica.Shipping.*;

public class AirShippingStrategyTest {

    @Test
    public void testCalculateCost() {
        Dimensions dim = new Dimensions(2, 2, 2); // volume = 8
        ShippingObjet request = new ShippingObjet(10, dim, "A", "B");
        AirShippingStrategy strategy = new AirShippingStrategy();

        // cost = 5.0 * 10 + 0.02 * 8 = 50 + 0.16 = 50.16
        double cost = strategy.calculateCost(request);
        assertEquals(50.16, cost, 0.0001);
    }
}