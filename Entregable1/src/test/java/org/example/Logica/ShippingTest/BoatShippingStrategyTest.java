package org.example.Logica.ShippingTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.Logica.Shipping.*;

public class BoatShippingStrategyTest {

    @Test
    public void testCalculateCost() {
        Dimensions dim = new Dimensions(3, 3, 3); // volume = 27
        ShippingObjet request = new ShippingObjet(4, dim, "X", "Y");
        BoatShippingStrategy strategy = new BoatShippingStrategy();

        // cost = 3.0 + 0.01 * 27 + 0.5 * 4 = 3 + 0.27 + 2 = 5.27
        double cost = strategy.calculateCost(request);
        assertEquals(5.27, cost, 0.0001);
    }
}