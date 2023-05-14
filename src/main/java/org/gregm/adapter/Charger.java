package org.gregm.adapter;

public class Charger implements  LightningSocket{

    @Override
    public void connect() {
        System.out.println("Connected to charger via Lightning port");
    }

    public void induction(){
        System.out.println("Charging with induction...");
    }
}
