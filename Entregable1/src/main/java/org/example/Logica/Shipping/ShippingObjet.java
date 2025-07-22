package org.example.Logica.Shipping;

public class  ShippingObjet {
    private double weight;
    private Dimensions dimensions;
    private String origin;
    private String destination;

    public ShippingObjet(double weight, Dimensions dimensions, String origin, String destination) {
        this.weight = weight;
        this.dimensions = dimensions;
        this.origin = origin;
        this.destination = destination;
    }

    public double getWeight() {
        return weight;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }
}
