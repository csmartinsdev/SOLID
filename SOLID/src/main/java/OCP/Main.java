package OCP;

import OCP.good.FixedDiscount;
import OCP.good.Order;
import OCP.good.PercentageDiscount;

public class Main {
    public static void main(String[] args) {
        var fixedDiscount = new Order(300.90);
        fixedDiscount.setDiscount(new FixedDiscount(20.0));

        System.out.println("Fixed discount: R$ " + fixedDiscount.getAmount() );

        var percentageDiscount = new Order(300.0,  new PercentageDiscount(20.0));
        System.out.println("Percentage Discount: $ " + percentageDiscount.getAmount());
    }
}
