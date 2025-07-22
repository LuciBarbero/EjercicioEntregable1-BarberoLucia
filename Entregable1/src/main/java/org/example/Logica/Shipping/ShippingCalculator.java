package org.example.Shipping;

public class ShippingCalculator {
    private ShippingObjet shipment;
    private ShippingStrategy strategy;

    public ShippingCalculator(ShippingObjet shipment, ShippingStrategy strategy) {
        this.shipment = shipment;
        this.strategy = strategy;
    }

    public double calculateCost() {
        return strategy.calculateCost(shipment);
    }
}
