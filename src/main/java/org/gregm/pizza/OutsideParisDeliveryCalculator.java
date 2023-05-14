package org.gregm.pizza;

public class OutsideParisDeliveryCalculator implements DeliveryPlanCalculator{
    @Override
    public double pricefor(Pizza pizza) {
        return pizza.getPrice() * 0.1;
    }
}
