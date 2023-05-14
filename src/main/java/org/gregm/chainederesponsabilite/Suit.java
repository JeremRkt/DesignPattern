package org.gregm.chainederesponsabilite;

public class Suit {
    public void wash(SuitWashStep firstStep){
        firstStep.applyTo(this);
    }
}
