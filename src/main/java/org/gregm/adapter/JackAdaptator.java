package org.gregm.adapter;

public class JackAdaptator implements LightningSocket{

    private JackEarphones speakersJack;

    public JackAdaptator(JackEarphones speakersJack) {
        this.speakersJack = speakersJack;
    }

    @Override
    public void connect() {
        speakersJack.playMusic();
    }
}
