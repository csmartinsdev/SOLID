package SRP.bad;

import SRP.Order;

public class OrderProcessorService {
    public void processOrder(Order order) {
        this.checkInventory(order);
        this.calculateTotal(order);
        this.processPayment(order);
    }

    private void checkInventory(Order order) {
        System.out.println("check inventory");
    }

    private void calculateTotal(Order order) {
        System.out.println("Calculate Total");
    }

    private void processPayment(Order order) {
        System.out.println("process payment");
    }
}
