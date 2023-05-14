package org.gregm.pizza;

public class ToGoDeliveryPriceCalculator implements DeliveryPlanCalculator{
    @Override
    public double pricefor(Pizza pizza) {
        return pizza.getPrice()* -0.1;
    }
}
