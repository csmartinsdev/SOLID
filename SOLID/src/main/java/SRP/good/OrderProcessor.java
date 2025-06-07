package SRP.good;

import SRP.Order;

public class OrderProcessor {
    private InventoryChecker inventoryChecker;
    private OrderCalculator orderCalculator;
    private PaymentProcessor paymentProcessor;

    public OrderProcessor(InventoryChecker inventoryChecker, OrderCalculator orderCalculator, PaymentProcessor paymentProcessor) {
        this.inventoryChecker = inventoryChecker;
        this.orderCalculator = orderCalculator;
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder(Order order) {
        inventoryChecker.check(order);
        orderCalculator.calculate(order);
        paymentProcessor.process(order);
    }
}
