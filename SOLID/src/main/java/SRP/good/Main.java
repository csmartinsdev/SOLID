package SRP.good;

import SRP.Order;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        var inventoryChecker = new InventoryChecker();
        var orderCalculator = new OrderCalculator();
        var paymentProcessor = new PaymentProcessor();

        Order order = new Order(UUID.randomUUID(), 500.0);

        var orderProcessor = new OrderProcessor(inventoryChecker, orderCalculator, paymentProcessor);
        orderProcessor.processOrder(order);
    }
}
