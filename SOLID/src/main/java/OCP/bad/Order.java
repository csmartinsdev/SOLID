package OCP.bad;

import exception.DomainException;

public class Order {
    private Double amount;

    public Order(Double amount) {
        this.amount = amount;
    }

    public void applyFixedDiscount(double discount) {
        if (discount > this.amount) {
            throw new DomainException("Discount cannot be greater than order amount.");
        }

        this.amount = this.amount - discount;
    }

    public void applyPercentageDiscount(double percentage) {
        if (percentage > 100 || percentage <= 0) {
            throw new DomainException("Enter the percentage value between 1 and 100.");
        }

        this.amount = this.amount - (this.amount * (percentage / 100));
    }


    public Double getAmount() {
        return amount;
    }
}
