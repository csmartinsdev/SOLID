package OCP.good;

import exception.DomainException;

public class FixedDiscount implements Discount {
    private final Double value;

    public FixedDiscount(Double value) {
        this.value = value;
    }

    @Override
    public Double apply(Double orderAmount) {
        if (value > orderAmount) {
            throw new DomainException("Discount cannot be greater than order amount.");
        }
        return orderAmount - value;
    }
}
