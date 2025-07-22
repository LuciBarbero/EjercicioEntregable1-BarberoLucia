package org.example.Shipping;

public class AirShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateCost(ShippingObjet shipment) {
        double baseRate = 5.0;
        double volume = shipment.getDimensions().getVolume();
        return baseRate * shipment.getWeight() + 0.02 * volume;
    }
}