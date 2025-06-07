package SRP.bad;

import java.util.UUID;

public class Order {
    private UUID id;
    private Double amount;


    public Order(UUID id, Double amount) {
        this.id = id;
        this.amount = amount;
    }

    public UUID getId() {
        return id;
    }

    public Double getAmount() {
        return amount;
    }
}
