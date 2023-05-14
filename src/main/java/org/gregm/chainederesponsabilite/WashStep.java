package org.gregm.chainederesponsabilite;

public class WashStep extends SuitWashStep{
    public WashStep() {
        super("Washing");
    }

    @Override
    public void applyTo(Suit suit) {
        System.out.println("Step 2: " + step +" the suit");
        if (nextStep != null){
            nextStep.applyTo(suit);
        }
    }

}
