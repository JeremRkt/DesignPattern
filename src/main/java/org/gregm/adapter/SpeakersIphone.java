package org.gregm.adapter;

public class SpeakersIphone implements LightningSocket{
    @Override
    public void connect() {
        System.out.println("Battery low!");
    }
}
