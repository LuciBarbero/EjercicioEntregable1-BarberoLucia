package org.example.Shipping;

public class TruckShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateCost(ShippingObjet shipment) {
        double baseRate = 2.5;
        boolean isLocal = shipment.getOrigin().equalsIgnoreCase(shipment.getDestination());
        double distanceFactor = isLocal ? 1.0 : 1.5;
        return baseRate * shipment.getWeight() * distanceFactor;
    }
}