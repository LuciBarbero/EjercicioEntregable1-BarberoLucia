package org.example;

import org.example.Logica.Payment.*;
import org.example.Logica.Shipping.*;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto a pagar:");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // limpiar buffer

        System.out.println("Seleccione el proveedor de pago (paypal o mercadopago):");
        String provider = scanner.nextLine().toLowerCase();

        System.out.println("Ingrese el peso del paquete:");
        double weight = scanner.nextDouble();

        System.out.println("Ingrese ancho:");
        double width = scanner.nextDouble();
        System.out.println("Ingrese alto:");
        double height = scanner.nextDouble();
        System.out.println("Ingrese largo:");
        double length = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Ingrese origen:");
        String origin = scanner.nextLine();

        System.out.println("Ingrese destino:");
        String destination = scanner.nextLine();

        System.out.println("Seleccione el método de envío (air, truck, boat):");
        String shippingMethod = scanner.nextLine().toLowerCase();

        scanner.close();

        CompletableFuture<Double> shippingCostFuture = CompletableFuture.supplyAsync(() -> {
            Dimensions dimensions = new Dimensions(width, height, length);
            ShippingStrategy strategy;

            switch (shippingMethod) {
                case "air":
                    strategy = new AirShippingStrategy();
                    break;
                case "truck":
                    strategy = new TruckShippingStrategy();
                    break;
                case "boat":
                    strategy = new BoatShippingStrategy();
                    break;
                default:
                    throw new IllegalArgumentException("Método inválido");
            }

            ShippingObjet shippingObjet = new ShippingObjet(weight, dimensions, origin, destination);
            ShippingCalculator calculator = new ShippingCalculator(shippingObjet, strategy);
            double cost = calculator.calculateCost();
            System.out.println("Costo de envio: $" + cost);
            return cost;
        });

        CompletableFuture<Void> paymentFuture = shippingCostFuture.thenAcceptAsync(shippingCost -> {
            double totalAmount = amount + shippingCost;
            PaymentObjet paymentObjet = new PaymentObjet(totalAmount, provider);
            PaymentManager paymentManager = new PaymentManager();
            paymentManager.processPayment(paymentObjet);
        });

        paymentFuture.join();
        System.out.println("Pago y envio completados.");
    }
}