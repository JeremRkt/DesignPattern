package org.gregm.chainederesponsabilite;

public class SoakClothes extends SuitWashStep{

    public SoakClothes() {
        super("Soaking");
    }
    @Override
      public void applyTo(Suit suit) {
        System.out.println("Step 1: " + step +" the suit");
        if (nextStep != null){
            nextStep.applyTo(suit);
        }
    }


}
