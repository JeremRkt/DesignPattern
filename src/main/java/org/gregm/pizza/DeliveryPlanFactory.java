package org.gregm.pizza;

public class DeliveryPlanFactory {
    public DeliveryPlanCalculator priceCalculatorFor(DeliveryPlan deliveryPlan){

        return switch (deliveryPlan) {
            case TO_GO -> new ToGoDeliveryPriceCalculator();
            case IN_PARIS -> new InParisDeliveryCalculator();
            case OUTSIDE_PARIS -> new OutsideParisDeliveryCalculator();
        };
    }
}
