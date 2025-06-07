package OCP.good;

import exception.DomainException;

public class PercentageDiscount implements Discount {
    private final double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
        if (percentage > 100 || percentage <= 0) {
            throw new DomainException("Enter the percentage value between 1 and 100.");
        }
    }

    @Override
    public Double apply(Double orderAmount) {
        return orderAmount - (orderAmount * (percentage / 100));
    }
}
