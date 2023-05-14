package org.gregm.chainederesponsabilite;

public class DryStep extends SuitWashStep{
    public DryStep() {
        super("Drying");
    }

    @Override
    public void applyTo(Suit suit) {
        System.out.println("Step 3: " + step +" the suit");
        if (nextStep != null){
            nextStep.applyTo(suit);
        }
    }
}
