package org.gregm.adapter;

public class Earphones implements LightningSocket{
    @Override
    public void connect() {
        System.out.println("Earphones are connected via the Jack Port");
    }
    public void bluetoothConnect(){
        System.out.println("You are connected via bluetooth !");
    }
}
