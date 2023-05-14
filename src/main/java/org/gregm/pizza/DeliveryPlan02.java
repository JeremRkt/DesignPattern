package org.gregm.pizza;

public enum DeliveryPlan02 {
    TO_GO{
        @Override
        public Double getCost(Pizza pizza) {
            return pizza.getPrice()* -0.1;
        }
    },
    IN_PARIS{
        @Override
        public Double getCost(Pizza pizza) {
            return pizza.getPrice()*0.05;
        }
    },
    OUTSIDE_PARIS{
        @Override
        public Double getCost(Pizza pizza) {
            return pizza.getPrice()* 0.1;
        }
    };
    public Double getCost(Pizza pizza){
        return pizza.getPrice()*0.05;
    }
}
