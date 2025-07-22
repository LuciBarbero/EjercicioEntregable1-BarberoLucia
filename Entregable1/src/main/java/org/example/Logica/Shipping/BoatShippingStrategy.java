package org.example.Logica.Shipping;

public class BoatShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateCost(ShippingObjet shipment) {
        double baseRate = 3.0;
        double volume = shipment.getDimensions().getVolume();
        return baseRate + 0.01 * volume + 0.5 * shipment.getWeight();
    }

}
