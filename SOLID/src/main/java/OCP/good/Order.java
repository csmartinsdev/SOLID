package OCP.good;

public class Order {
    private Double amount;
    private Discount discount;

    public Order(Double amount) {
        this.amount = amount;
        this.discount = null;
    }

    public Order(Double amount, Discount discount) {
        this.amount = amount;
        this.discount = discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Double getAmount() {
        if (this.discount != null) {
            amount = discount.apply(amount);
        }

        return amount;
    }
}
