package org.gregm.adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LightningSocket chargerIphone = new Charger();
        LightningSocket speakersIphone = new SpeakersIphone();
        JackEarphones jackEarphones   = new JackEarphones();
        LightningSocket jackAdaptator   = new JackAdaptator(jackEarphones);
        LightningSocket earphones = new Earphones();


        List<LightningSocket> devices = new ArrayList<>();
        devices.add(speakersIphone);
        devices.add(chargerIphone);
        devices.add(jackAdaptator);
        devices.add(earphones);

        devices.forEach(device -> device.connect());

        //----------------------------------------------------------------------------------//

    }
}
