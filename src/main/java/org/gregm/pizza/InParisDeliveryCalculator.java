package org.gregm.pizza;

public class InParisDeliveryCalculator implements DeliveryPlanCalculator{
    @Override
    public double pricefor(Pizza pizza) {
        return pizza.getPrice()*0.05;
    }
}
