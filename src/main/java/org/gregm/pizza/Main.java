package org.gregm.pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizzaCannibale = new Pizza("Cannibale", 12.5);


        DeliveryPlanFactory factory = new DeliveryPlanFactory();
        double price = factory.priceCalculatorFor(DeliveryPlan.TO_GO).pricefor(pizzaCannibale);

        System.out.println("Prix de livraison TO GO: " + factory.priceCalculatorFor(DeliveryPlan.TO_GO).pricefor(pizzaCannibale));
        System.out.println("Prix de livraison IN PARIS: " + factory.priceCalculatorFor(DeliveryPlan.IN_PARIS).pricefor(pizzaCannibale));
        System.out.println("Prix de livraison OUTSIDE PARIS: " + factory.priceCalculatorFor(DeliveryPlan.OUTSIDE_PARIS).pricefor(pizzaCannibale));

        Pizza pizzaMargarita = new Pizza("Margarita", 9.99);
        System.out.println("Prix de livraison TO GO: " + DeliveryPlan02.TO_GO.getCost(pizzaMargarita));
        System.out.println("Prix de livraison IN PARIS: " + DeliveryPlan02.IN_PARIS.getCost(pizzaMargarita));
        System.out.println("Prix de livraison OUTSIDE PARIS: " + DeliveryPlan02.OUTSIDE_PARIS.getCost(pizzaMargarita));

        Pizza pizzaCalzone = new Pizza("Calzone", 9.99);
        System.out.println("Prix de livraison TO GO: " + DeliveryPlan03.TO_GO.getLabel() + ":" + DeliveryPlan03.TO_GO.getDeliveryPrice().apply(pizzaCalzone));
        System.out.println("Prix de livraison IN PARIS: " + DeliveryPlan03.IN_PARIS.getLabel() + ":" + DeliveryPlan03.IN_PARIS.getDeliveryPrice().apply(pizzaCalzone));
        System.out.println("Prix de livraison OUTSIDE PARIS: " + DeliveryPlan03.OUTSIDE_PARIS.getLabel() + ":" + DeliveryPlan03.OUTSIDE_PARIS.getDeliveryPrice().apply(pizzaCalzone));

    }
}
