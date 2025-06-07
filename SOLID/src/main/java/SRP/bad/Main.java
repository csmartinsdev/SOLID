package SRP.bad;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(UUID.randomUUID(), 500.0);
        OrderProcessorService service = new OrderProcessorService();

        service.processOrder(order);
    }
}
